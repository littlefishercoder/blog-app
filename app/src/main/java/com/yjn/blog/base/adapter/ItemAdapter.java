package com.yjn.blog.base.adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.yjn.blog.base.item.Item;
import com.yjn.blog.base.itemview.ItemView;
import com.yjn.common.util.ToastUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;


public class ItemAdapter extends BaseAdapter {
    protected String TAG = "ItemAdapter";

    /**
     * 默认子类类型数量上限
     */
    protected static final int DEFAULT_MAX_VIEW_TYPE_COUNT = 30;

    /**
     * 对于底层实例统计
     *
     * @author ww
     */
    private class TypeInfo {
        /**
         * 某类item数量
         */
        int count;
        /**
         * item的具体类型
         */
        int type;
    }

    /**
     * items
     */
    protected List<Item> mItems;
    /**
     * 类型统计
     */
    protected HashMap<Class<? extends Item>, TypeInfo> mTypes;
    protected Context mContext;
    /**
     * 刷新开关
     */
    private boolean mNotifyOnChange = false;
    /**
     * 子类类型数量上限
     */
    private int mMaxViewTypeCount;

    public ItemAdapter(Context context) {
        this(context, new ArrayList<Item>());
    }

    public ItemAdapter(Context context, Item[] items) {
        // List<String> list = Arrays.asList(arrs);
        // String[] array = list.toArray(new String[0]);
        this(context, Arrays.asList(items), DEFAULT_MAX_VIEW_TYPE_COUNT);
    }

    public ItemAdapter(Context context, List<Item> items) {
        this(context, items, DEFAULT_MAX_VIEW_TYPE_COUNT);
    }

    public ItemAdapter(Context context, Item[] items, int maxViewTypeCount) {
        this(context, Arrays.asList(items), maxViewTypeCount);
    }

    public ItemAdapter(Context context, List<Item> items, int maxViewTypeCount) {
        mContext = context;
        mItems = items;
        mTypes = new HashMap<Class<? extends Item>, TypeInfo>();
        mMaxViewTypeCount = Integer.MAX_VALUE;

        for (Item item : mItems) {
            addItemType(item);
        }

        mMaxViewTypeCount = Math.max(1, Math.max(mTypes.size(), maxViewTypeCount));
    }

    /**
     * 添加item类型，并不添加到list中
     *
     * @param item
     */
    private void addItemType(Item item) {
        final Class<? extends Item> klass = item.getClass();
        TypeInfo info = mTypes.get(klass);

        if (info == null) {
            final int type = mTypes.size();
            if (type >= mMaxViewTypeCount) {
                throw new RuntimeException("This ItemAdapter may handle only " + mMaxViewTypeCount + " different view types.");
            }
            final TypeInfo newInfo = new TypeInfo();
            newInfo.count = 1;
            newInfo.type = type;
            mTypes.put(klass, newInfo);
        } else {
            info.count++;
        }
    }

    /**
     * 删除item类型，并不删除list中item
     *
     * @param item
     */
    private void removeItemType(Item item) {

        final Class<? extends Item> klass = item.getClass();
        TypeInfo info = mTypes.get(klass);

        if (info != null) {
            info.count--;
            if (info.count == 0) {
                mTypes.remove(klass);
            }
        }
    }

    /**
     * 重新注入List数据，更新数据入口<br>
     * 1、清除所有item<br>
     * 2、重新添加Items<br>
     * 3、notifyDataSetChanged()<br>
     * <p>
     * Bug:注入的list<Item> 高层进行clear时，此list也会被清空
     *
     * @param items
     */
    public void setItems(List<Item> items) {
        if (mItems != items) {
            mItems.clear();
            mItems = items;
        }
        // mTypes.clear();
        // for (Item item : items) {
        // addItemType(item);
        // }
        if (mNotifyOnChange) {
            notifyDataSetChanged();
        }
    }

    public void setList(List items) {
        if (items != null) {
            mItems = items;
        }
        if (mNotifyOnChange) {
            notifyDataSetChanged();
        }
    }

    /**
     * 在原有基础上添加
     *
     * @param items
     */
    public void addItems(List<? extends Item> items) {
        if (items.size() > 0) {
            mItems.addAll(items);
        } else {
            if (mItems.size() > 0) { //上拉加载
                ToastUtil.showShort(mContext, "到底啦");
            } else { //下拉刷新
                ToastUtil.showShort(mContext, "暂无数据");
            }
        }
        // for (Item item : items) {
        // addItemType(item);
        // }
        if (mNotifyOnChange) {
            notifyDataSetChanged();
        }
    }

    public void addItem(int index, Item item) {
        mItems.add(index, item);
        // addItemType(item);
        if (mNotifyOnChange) {
            notifyDataSetChanged();
        }
    }

    public void addItems(int index, List<Item> items) {
        if (items.size() > 0) {
            mItems.addAll(index, items);
        }
        // for (Item item : items) {
        // addItemType(item);
        // }
        if (mNotifyOnChange) {
            notifyDataSetChanged();
        }
    }

    public void add(Item item) {
        mItems.add(item);
        // addItemType(item);
        if (mNotifyOnChange) {
            notifyDataSetChanged();
        }
    }

    public void insert(Item item, int index) {
        mItems.add(index, item);
        // addItemType(item);
        if (mNotifyOnChange) {
            notifyDataSetChanged();
        }
    }

    public void remove(int itemIndex) {
        mItems.remove(itemIndex);
        if (mNotifyOnChange) {
            notifyDataSetChanged();
        }
    }

    public void remove(Item item) {
        if (mItems.remove(item)) {
            removeItemType(item);
            if (mNotifyOnChange) {
                notifyDataSetChanged();
            }
        }
    }

    public void shutDown() {
        clear();
        mItems = null;
        mTypes = null;
        mContext = null;
    }

    public void clear() {
        mItems.clear();
        mTypes.clear();
        if (mNotifyOnChange) {
            notifyDataSetChanged();
        }
    }

    public List<Item> getItems() {
        return mItems;
    }

    public List<? extends Item> getBeans() {
        return mItems;
    }

    /**
     * 排序
     */
    public void sort(Comparator<? super Item> comparator) {
        Collections.sort(mItems, comparator);
        if (mNotifyOnChange) {
            notifyDataSetChanged();
        }
    }

    public boolean ismNotifyOnChange() {
        return mNotifyOnChange;
    }

    public void setmNotifyOnChange(boolean mNotifyOnChange) {
        this.mNotifyOnChange = mNotifyOnChange;
    }

    public int getmMaxViewTypeCount() {
        return mMaxViewTypeCount;
    }

    public void setmMaxViewTypeCount(int mMaxViewTypeCount) {
        this.mMaxViewTypeCount = mMaxViewTypeCount;
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Item getItem(int position) {
        if (position >= mItems.size() || position < 0) {
            return null;
        } else {
            return mItems.get(position);
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     * 貌似在ListView设置完adapter之后再设置此方法
     * 计算子项View的宽高，listItem只能是LinearLayout，LinearLayout重写了onmeasure方法，
     * 其他的布局文件没有重写onmeasure,所以在调用listItem.measure(0, 0); 会报空指针异常，
     * 如果想用这个东东，就必须用LinearLayout布局
     *
     * @param listView
     */
    public void setListViewHeightBasedOnChildren(ListView listView) {
        // 获取ListView对应的Adapter
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            return;
        }
        int count = listAdapter.getCount();
        int totalHeight = 0;
        int itemHeight = 0;
        int exceptionCount = 0;
        View listItem;
        for (int i = 0; i < count; i++) {
            listItem = listAdapter.getView(i, null, listView);
            /*
             * 计算子项View的宽高，listItem只能是LinearLayout，LinearLayout重写了onmeasure方法，
			 * 其他的布局文件没有重写onmeasure,所以在调用listItem.measure(0, 0); 会报空指针异常，
			 * 如果想用这个东东，就必须用LinearLayout布局 java.lang.IllegalStateException:
			 * onMeasure() did not set the measured dimension by calling
			 * setMeasuredDimension()
			 */
            try {
                listItem.measure(0, 0);
                itemHeight = listItem.getMeasuredHeight();
                // 统计所有子项的总高度
                totalHeight += itemHeight;
            } catch (Exception e) {
                exceptionCount++;
            }
            if (exceptionCount > 0) {
                totalHeight = totalHeight / (count - exceptionCount) + totalHeight;
            }
        }
        // listView.getDividerHeight()获取子项间分隔符占用的高度
        // params.height最后得到整个ListView完整显示需要的高度
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        ((MarginLayoutParams) params).setMargins(10, 10, 10, 10);
        listView.setLayoutParams(params);
    }

    /**
     * 在acty中控制衣服的特殊显示
     */
    private Bundle bundle = new Bundle();

    /**
     * 在acty中控制衣服的特殊显示
     */
    public Bundle getItemViewBundle() {
        return bundle;
    }

    /**
     * 在acty中控制衣服的特殊显示
     */
    public void setItemViewBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Item item = getItem(position);

        ItemView itemView;
        if (convertView != null && convertView.getTag() != null && Integer.valueOf(convertView.getTag().toString()) == item.getItemLayoutId()) {
            itemView = (ItemView) convertView;
        } else {
            itemView = item.newView(mContext, null);
            itemView.findViewsByIds(bundle);
            convertView = (View) itemView;
            convertView.setTag(item.getItemLayoutId());
        }

        // 绑定数据
        itemView.setObject(item, position, onViewClickListener);


        return (View) itemView;
    }

    protected OnViewClickListener onViewClickListener;

    public OnViewClickListener getOnViewClickListener() {
        return onViewClickListener;
    }

    public void setOnViewClickListener(OnViewClickListener onViewClickListener) {
        this.onViewClickListener = onViewClickListener;
    }

    public interface OnViewClickListener {
        void onViewClick(View view, int position);
    }

    /**
     * 只更新一行 通过itemView.setObject(item, position, onViewClickListener)实现
     *
     * @param listView
     * @param itemView
     * @param item
     * @return void
     */
    public void updateSingleRow(ListView listView, ItemView itemView, Item item) {
        int findItemIndex = findItemIndex(listView, item);
        if (findItemIndex != -1) {
            updateSingleRow(itemView, findItemIndex, item);
        }
    }

    /**
     * 只更新一行 通过itemView.setObject(item, position, onViewClickListener)实现
     *
     * @param itemView
     * @param position
     * @param item
     * @return void
     */
    public void updateSingleRow(ItemView itemView, int position, Item item) {
        itemView.setObject(item, position, onViewClickListener);
    }

    /**
     * <h3>更新单条http://my.eoe.cn/767795/archive/21252.html</h3>
     * 实现的原理也简单。首先传入你要更新的item的数据，然后，它会先去获得当前屏幕listview显示的第一条item，
     * 然后再获取当前屏幕listview显示的最后一条item，然后去循环匹配是不是你需要更新的那个item，
     * 如果是，就手动调用getview，传入它的position，即可更新，这样做的结果就是：只调用有数据更改
     * 的item去重新绘制界面，大大优化了UI性能。以上单条更新的代码，在实际的项目中测试过，并得到很好的 体验，各位童鞋可以放心使用。
     *
     * @param listView
     * @param item
     * @return void
     */
    public void updateSingleRow(ListView listView, Item item) {
        int start = listView.getFirstVisiblePosition();
        int findItemIndex = findItemIndex(listView, item);
        if (findItemIndex != -1) {
            View view = listView.getChildAt(findItemIndex - start);
            getView(findItemIndex, view, listView);
        }
    }

    /**
     * 根据item获取他的index
     *
     * @param listView
     * @param item
     * @return void
     */
    public int findItemIndex(ListView listView, Item item) {
        if (listView != null) {
            for (int i = listView.getFirstVisiblePosition(), j = listView.getLastVisiblePosition(); i <= j; i++) {
                if (item == listView.getItemAtPosition(i)) {
//					if (listView instanceof PullToRefreshListView) {
//						// -1因为pullToRefreshListView含有头部
//						i--;
//					}
                    return i;
                }
            }
        }
        return -1;
    }


    private MyAnim anim;
    private long lastTime;

//    public void deleteItemViewWithAnim(Item item) {
////        synchronized (this) {
////            YJHLog.i(TAG, "ItemAdapter中：deleteItemViewWithAnim方法-------------->");
////            final View rootView = listView.getChildAt(position - listView.getFirstVisiblePosition());
//        final View rootView = (View) item.getItemView();
//        long chaTime = (System.currentTimeMillis() - lastTime);
//        if (anim == null || chaTime < 150) {
//            anim = new MyAnim();
//        }
//        lastTime = System.currentTimeMillis();
////            YJHLog.i(TAG, "deleteItemViewWithAnim方法中----anim---->：item：" + item);
//
//        anim.init(rootView, item);
//
////        }
//
//    }


    /**
     * TODO Bug记录：
     * onAnimationEnd回调不是每次必执行，如果多个动画同时执行将产生bug。
     * 造成原因：applyTransformation回调中interpolatedTime的值[0, 1]不一定能到1，有时候到0.8就结束了，导致onAnimationEnd回调也不被执行。
     */
    private class MyAnim extends Animation {

        private View rootView;
        private int initialHeight;
        private Item item;

        public void init(View rootView, Item item) {
            this.rootView = rootView;
            this.item = item;
            this.initialHeight = rootView.getMeasuredHeight();
            rootView.setAnimation(this);
            rootView.startAnimation(this);
        }


        public MyAnim() {
            this.setDuration(200);
            this.setAnimationListener(new AnimationListener() {
                @Override
                public void onAnimationEnd(Animation animation) {
                    // 还原
                    MyAnim.this.rootView.getLayoutParams().height = initialHeight;
                    // MyAnim.this.rootView.requestLayout();

                    // 删除数据
                    remove(item);
                    notifyDataSetChanged();
                    //free(MyAnim.this);
                }

                @Override
                public void onAnimationStart(Animation animation) {
                }

                @Override
                public void onAnimationRepeat(Animation animation) {
                }
            });
        }

        @Override
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            int cur = initialHeight - (int) (initialHeight * interpolatedTime);
//            if (rootView.getLayoutParams().height != cur) {
            rootView.getLayoutParams().height = cur;
            rootView.requestLayout();
//            }
        }

        @Override
        public boolean willChangeBounds() {
            return false;
        }
    }

}
