package com.yjn.blog.app.presenter;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yjn.blog.app.Constants;
import com.yjn.blog.app.contract.BlogContract;
import com.yjn.blog.base.item.BlogQryByPagerItem;
import com.yjn.blog.base.utils.GsonUtil;

import java.util.Map;

import io.reactivex.functions.Consumer;

/**
 * @author yang.jianan
 * @date 2018/02/06 10:00.
 * Desc：
 */

public class BlogPresenter extends BlogContract.Presenter {
    @Override
    public void queryBlogByPager(Map postMap) {
        mRxManage.add(mModel.queryBlogByPager(postMap).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                JSONObject backJO = JSON.parseObject(s);
                if (Constants.SUCCESS.equals(backJO.getString("result"))) {
                    mView.queryBlogByPagerSuccess(GsonUtil.getInstance().fromJson(backJO.getString("data"), BlogQryByPagerItem.class));
                } else {
                    mView.showErrorTip(backJO.getString("errorMsg"));
                }
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                mView.showErrorTip("服务器繁忙请稍后再试");
            }
        }));
    }
}
