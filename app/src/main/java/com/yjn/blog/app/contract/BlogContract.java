package com.yjn.blog.app.contract;

import com.yjn.blog.base.item.BlogQryByPagerItem;
import com.yjn.common.base.BaseModel;
import com.yjn.common.base.BasePresenter;
import com.yjn.common.base.BaseView;

import java.util.Map;

import io.reactivex.Observable;

/**
 * @author yang.jianan
 * @date 2018/02/06 09:54.
 * Desc：博客桥梁
 */

public interface BlogContract {
    interface Model extends BaseModel {
        Observable<String> queryBlogByPager(Map postMap);
    }

    interface View extends BaseView {
        void queryBlogByPagerSuccess(BlogQryByPagerItem blogQryByPagerItem);
    }

    abstract class Presenter extends BasePresenter<View, Model> {
        public abstract void queryBlogByPager(Map postMap);
    }
}
