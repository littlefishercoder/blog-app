package com.yjn.blog.frags.account;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.yjn.blog.R;
import com.yjn.blog.contract.LoginContract;
import com.yjn.blog.model.LoginModel;
import com.yjn.blog.presenter.LoginPresenter;
import com.yjn.common.base.BaseFragment;
import com.yjn.common.util.ToastUtil;

import net.qiujuer.genius.ui.widget.Loading;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by yangjianan on 2018/7/12.
 */
public class LoginFragment extends BaseFragment<LoginPresenter, LoginModel> implements LoginContract.View {
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
        mPresenter.setVM(this, mModel);
    }

    @Override
    protected void initView() {

    }

    @OnClick(R.id.btn_submit)
    void onSubmitClick() {
        String phone = mPhone.getText().toString();
        String password = mPassword.getText().toString();
        if (TextUtils.isEmpty(phone) || TextUtils.isEmpty(password)) {
            ToastUtil.showShort(mContext, "请输入账号密码");
            return;
        }
        //文本参数
        Map<String, String> postMap = new HashMap();
        postMap.put("username", phone);
        postMap.put("password", password);

        // 调用P层进行注册
        mPresenter.login(postMap);
    }

    @OnClick(R.id.txt_go_register)
    void onShowRegisterClick() {
        // 让AccountActivity进行界面切换
        accountFragsSwtich.switchFrag();
    }

    @Override
    public void loginSuccess(String data) {
        Log.i("LoginFragment0---><", data);
        ToastUtil.showShort(mContext, "登录成功");
        dialogDismiss();
    }

    @Override
    public void showLoading(String title) {
        dialog.setLabel(title);
        dialog.show();
    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showErrorTip(String msg) {
        ToastUtil.showShort(mContext, msg);
        dialogDismiss();
    }
}
