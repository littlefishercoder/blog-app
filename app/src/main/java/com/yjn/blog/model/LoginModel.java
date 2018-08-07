package com.yjn.blog.model;

import com.yjn.blog.api.Api;
import com.yjn.blog.api.HostType;
import com.yjn.blog.contract.LoginContract;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

/**
 * Created by yangjianan on 2018/8/7.
 */
public class LoginModel implements LoginContract.Model {
    @Override
    public Observable<String> login(Map postMap) {
        return Api.getDefault(HostType.TYPE_APP)
                .login(postMap)
                .map(new Function<ResponseBody, String>() {
                    @Override
                    public String apply(ResponseBody responseBody) throws Exception {
                        return responseBody.string();
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
