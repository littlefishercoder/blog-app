package com.yjn.blog.api;

/**
 * Created by yangjianan on 2018/8/7.
 */
public class ApiConstants {
    public static final String APP_HOST = "http://192.168.81.21:8080/";//URL
    public static final String SINGLE_LOGININ_RESTRICT_CODE = "10004"; //单点登录码
    public static final String BAIDU_HOST = "http://www.baidu.com/";
    public static final String ID_CARD_HOST = "api.youtu.qq.com/";

    /**
     * 获取对应的host
     *
     * @param hostType host类型
     * @return host
     */
    public static String getHost(int hostType) {
        String host;
        switch (hostType) {
            case HostType.TYPE_TEST:
                host = BAIDU_HOST;
                break;
            case HostType.TYPE_APP:
                host = APP_HOST;
                break;
            case HostType.TYPE_LOGIN:
                host = APP_HOST;
                break;
            default:
                host = "";
                break;
        }
        return host;
    }
}
