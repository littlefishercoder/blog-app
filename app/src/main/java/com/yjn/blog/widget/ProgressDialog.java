//package com.yjn.blog.widget;
//
//import android.app.Dialog;
//import android.content.Context;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.yjn.blog.R;
//
//
///**
// * 等待进度条
// *
// * @author Administrator
// */
//public class ProgressDialog extends Dialog {
//
//    private String msg;
//    private TextView msgTv;
//    private Context context;
//    private View view;
//    private ProgressWheel progressWheel;
//
//    private ImageView animIV;
//
//    /**
//     * 默认提示：请等待...
//     *
//     * @param context
//     */
//    public ProgressDialog(Context context) {
//        this(context, "请等待...");
//
//    }
//
//    /**
//     * 可添加提示
//     *
//     * @param context
//     * @param msg
//     */
//    public ProgressDialog(Context context, String msg) {
//        this(context, msg, R.style.MyDialog_);
//    }
//
//    public ProgressDialog(Context context, String msg, int theme) {
//        super(context, theme);
//        this.msg = msg;
//        this.context = context;
//        init();
//    }
//
//    public void init() {
//        view = getLayoutInflater().inflate(R.layout.dlg_progress_waite, null);
//        // Drawable myDrawable =
//        // context.getResources().getDrawable(R.drawable.eventdetails_bn_participate);
//        // myDrawable.setAlpha(200);
//        // view.setBackgroundDrawable(myDrawable);
//        progressWheel = (ProgressWheel) view.findViewById(R.id.progress_wheel);
////		progressWheel.setBarColor(barColor);
//
//        setContentView(view);
//        // 点击屏幕不消失
//        setCanceledOnTouchOutside(false);
//
//        findViews();
//        initViews();
//    }
//
//    public void setBarColor(int barColor) {
//        progressWheel.setBarColor(barColor);
//    }
//
//    public void findViews() {
//        msgTv = (TextView) findViewById(R.id.dpw_tv_msg);
//        animIV = (ImageView) findViewById(R.id.dpw_iv_anim);
//    }
//
//    public void initViews() {
//        msgTv.setText(msg);
//    }
//
//    /**
//     * 修改提示语
//     *
//     * @param msg
//     */
//    public void setMsg(String msg) {
//        this.msg = msg;
//        msgTv.setText(msg);
//    }
//
//    /**
//     * 设置返回键是否有用
//     */
//    @Override
//    public void setCancelable(boolean flag) {
//        super.setCancelable(flag);
//    }
//
//}
