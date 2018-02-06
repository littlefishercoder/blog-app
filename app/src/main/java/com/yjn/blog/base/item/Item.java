package com.cct.gridproject_android.base.item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.cct.gridproject_android.base.annotation.sqlite.Transient;
import com.cct.gridproject_android.base.itemview.ItemView;

import java.io.Serializable;
import java.util.HashMap;

//import com.emww.component.db.annotation.Transient;

public abstract class Item implements Serializable {

    @Transient
    private Object mTag;
    /**
     * SparseArray性能比HashMap性能高但不能被序列化，有些item标记后无法在acty页面间来回传值
     * http://blog.csdn.net/xyz_fly/article/details/7931943
     */
    // private SparseArray<Object> mTags;
    @Transient
    private HashMap<Integer, Object> mTags;

    public Object getTag() {
        return mTag;
    }

    public void setTag(Object tag) {
        mTag = tag;
    }

    public Object getTag(int key) {
        return (mTags == null) ? null : mTags.get(key);
    }

    public void setTag(int key, Object tag) {
        if (mTags == null) {
            // mTags = new SparseArray<Object>();
            mTags = new HashMap<Integer, Object>();
        }
        mTags.put(key, tag);
    }

//	private ItemView itemView;
//
//	public ItemView getItemView() {
//		return itemView;
//	}
//
//	public void setItemView(ItemView itemView) {
//		this.itemView = itemView;
//	}

    /**
     * 抽象方法，视图的默认创建
     *
     * @param context
     * @param parent
     * @return
     */
    public ItemView newView(Context context, ViewGroup parent) {
        ItemView itemView = createCellFromXml(context, getItemLayoutId(), parent);
        return itemView;
    }

    /***
     *
     * @return
     */
    public abstract int getItemLayoutId();

    public void setItemLayoutId(int layoutId) {

    }

    /**
     * 对象1对多视图的创建
     *
     * @param context
     * @param layoutID
     * @param parent
     * @return
     */
    public static ItemView createCellFromXml(Context context, int layoutID, ViewGroup parent) {
        return (ItemView) LayoutInflater.from(context).inflate(layoutID, parent, false);
    }

    /**
     * 从xml中填充布局
     *
     * @param r
     * @param parser
     * @param attrs
     * @throws XmlPullParserException
     * @throws IOException
     */
    // public void inflate(Resources r, XmlPullParser parser, AttributeSet
    // attrs) throws XmlPullParserException, IOException {
    // TypedArray a = r.obtainAttributes(attrs, R.styleable.Item);
    // enabled = a.getBoolean(R.styleable.Item_enabled, enabled);
    // a.recycle();
    // }

    // public ItemView getItemView() {
    // return itemView;
    // }
    //
    // public void setItemView(ItemView itemView) {
    // this.itemView = itemView;
    // }

    /**
     * 删除
     */
    public void delete() {

    }

    /**
     * 更新
     */
    public void update() {

    }

    /**
     * 创建
     *
     * @return
     */
    public int create() {
        return -1;
    }

    /**
     * 插入
     *
     * @return
     */
    public int insert() {
        return -1;
    }


}
