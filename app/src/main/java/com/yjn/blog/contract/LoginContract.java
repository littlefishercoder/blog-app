package com.yjn.blog.contract;

import com.yjn.common.base.BaseModel;
import com.yjn.common.base.BasePresenter;
import com.yjn.common.base.BaseView;

import java.util.Map;

import io.reactivex.Observable;

/**
 * Created by yangjianan on 2018/8/7.
 * Desc: 登录 MVP 的桥梁
 */
public interface LoginContract {
    interface Model extends BaseModel {
        Observable<String> login(Map postMap);
    }
    interface View extends BaseView{
        void loginSuccess(String data);
    }
    abstract class Presenter extends BasePresenter<View, Model> {
        public abstract void login(Map postMap);
    }
}
