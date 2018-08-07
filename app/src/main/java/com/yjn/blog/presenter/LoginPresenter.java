package com.yjn.blog.presenter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yjn.blog.contract.LoginContract;

import java.util.Map;

import io.reactivex.functions.Consumer;

/**
 * Created by yangjianan on 2018/8/7.
 */
public class LoginPresenter extends LoginContract.Presenter {
    @Override
    public void login(Map postMap) {
        mView.showLoading("\t\t登录中\t\t\t");
        mRxManage.add(mModel.login(postMap).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) {

                JSONObject backJO = JSON.parseObject(s);
                if ("0".equals(backJO.getString("code"))) {
                    mView.loginSuccess(backJO.getString("data"));
                } else {
                    mView.showErrorTip(backJO.getString("message"));
                }
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) {
                mView.showErrorTip("服务器繁忙请稍后再试");
            }
        }));
    }
}
