package com.yjn.blog.base.api;

/**
 * @author yang.jianan
 * @date 2018/02/06 09:26.
 * Desc：Api 常量
 */

public class ApiConstants {

    public static final String BAIDU_HOST = "http://www.baidu.com/";
    public static final String ID_CARD_HOST = "api.youtu.qq.com/";
    public static final String APP_HOST = "http://swagger.littlefisher.site:8088/blog-web/";

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
