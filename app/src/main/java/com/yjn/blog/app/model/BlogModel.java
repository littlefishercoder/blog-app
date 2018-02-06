package com.yjn.blog.app.model;

import com.yjn.blog.app.contract.BlogContract;
import com.yjn.blog.base.api.Api;
import com.yjn.blog.base.api.HostType;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

/**
 * @author yang.jianan
 * @date 2018/02/06 09:59.
 * Desc：
 */

public class BlogModel implements BlogContract.Model {
    @Override
    public Observable<String> queryBlogByPager(Map postMap) {
        return Api.getDefault(HostType.TYPE_APP)//
                .qryBlogList(postMap)//
                .map(new Function<ResponseBody, String>() {
                    @Override
                    public String apply(ResponseBody responseBody) throws Exception {
                        return responseBody.string();
                    }
                }).subscribeOn(Schedulers.io())//
                .observeOn(AndroidSchedulers.mainThread());
    }
}
