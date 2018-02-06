package com.cct.gridproject_android.base.api;

/**
 * Created by QinZB on 2017/9/3.
 */

public class ApiConstants {

    public static final String BAIDU_HOST = "http://www.baidu.com/";
    public static final String ID_CARD_HOST = "api.youtu.qq.com/";
    public static final String APP_HOST = "http://220.194.101.68:18002/";

    /**
     * 获取对应的host
     *
     * @param hostType host类型
     * @return host
     */
    public static String getHost(int hostType) {
        String host;
        switch (hostType) {
            case HostType.TYPE_BAIDU:
                host = BAIDU_HOST;
                break;
            case HostType.TYPE_ID_CARD:
                host = ID_CARD_HOST;
                break;
            case HostType.TYPE_APP:
                host = APP_HOST;
                break;
            case HostType.TYPE_FILE_UPLOAD:
                host = APP_HOST;
                break;
            default:
                host = "";
                break;
        }
        return host;
    }
}
