package com.yjn.blog.base.api;

import android.text.TextUtils;
import android.widget.Toast;

import com.yjn.blog.MyApplication;
import com.yjn.common.util.ToastUtil;
import com.yjn.common.util.Util;


/**
 * @author yang.jianan
 * @date 2018/02/06 09:26.
 * Desc：请求头配置
 */

public class HeaderConfig {

    public static String getDeviceNo() {
        if (TextUtils.isEmpty(deviceNo)) {
            String deviceNoNow;
            deviceNoNow = Util.getMacAddress();
            if (TextUtils.isEmpty(deviceNoNow)) {
                ToastUtil.show(MyApplication.getAppContext(), "网络出错，请检查网络", Toast.LENGTH_SHORT);
                return null;
            } else {
                deviceNo = deviceNoNow;
            }
        }
        return deviceNo;

    }

    // 渠道类型 1-Android 2-IOS,必填
    public static final String channel = "1";

    // 设备号,必填
    public static String deviceNo;

    public static String token = "";
}
