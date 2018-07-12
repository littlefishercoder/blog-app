package com.yjn.blog;

import android.content.Context;
import android.content.Intent;

import com.yjn.blog.actys.AccountActivity;
import com.yjn.common.base.BaseActivity;

public class MainActivity extends BaseActivity {
    /**
     * MainActivity显示的入口
     *
     * @param context Context
     */
    public static void show(Context context) {
        context.startActivity(new Intent(context, MainActivity.class));
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        AccountActivity.show(this);
    }
}
