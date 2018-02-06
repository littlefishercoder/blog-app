package com.yjn.blog.app;

import android.widget.TextView;

import com.yjn.blog.R;
import com.yjn.blog.app.contract.BlogContract;
import com.yjn.blog.app.model.BlogModel;
import com.yjn.blog.app.presenter.BlogPresenter;
import com.yjn.blog.base.item.BlogQryByPagerItem;
import com.yjn.common.base.BaseActivity;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends BaseActivity<BlogPresenter,BlogModel> implements BlogContract.View {

    private TextView content;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initPresenter() {
        mPresenter.setVM(this,mModel);
    }

    @Override
    public void initView() {
        content = findViewById(R.id.content);

        Map<String, Object> qryMap = new HashMap();
        qryMap.put("pageNum", 0);
        qryMap.put("pageSize", 10);
        mPresenter.queryBlogByPager(qryMap);
    }

    @Override
    public void queryBlogByPagerSuccess(BlogQryByPagerItem blogQryByPagerItem) {
        content.setText(blogQryByPagerItem.toString());
    }

    @Override
    public void showLoading(String title) {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showErrorTip(String msg) {

    }
}
