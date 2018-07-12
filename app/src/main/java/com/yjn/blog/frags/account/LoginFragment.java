package com.yjn.blog.frags.account;

import android.content.Context;
import android.widget.Button;
import android.widget.EditText;

import com.yjn.blog.R;
import com.yjn.common.base.BaseFragment;

import net.qiujuer.genius.ui.widget.Loading;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by yangjianan on 2018/7/12.
 */
public class LoginFragment extends BaseFragment {
    private AccountFragsSwtich accountFragsSwtich;

    @BindView(R.id.edit_phone)
    EditText mPhone;
    @BindView(R.id.edit_password)
    EditText mPassword;

    @BindView(R.id.loading)
    Loading mLoading;

    @BindView(R.id.btn_submit)
    Button mSubmit;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        // 拿到我们的Activity的引用
        accountFragsSwtich = (AccountFragsSwtich) context;
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_login;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {

    }

    @OnClick(R.id.btn_submit)
    void onSubmitClick() {
        String phone = mPhone.getText().toString();
        String password = mPassword.getText().toString();
        // 调用P层进行注册
        //mPresenter.login(phone, password);
    }

    @OnClick(R.id.txt_go_register)
    void onShowRegisterClick() {
        // 让AccountActivity进行界面切换
        accountFragsSwtich.switchFrag();
    }
}
