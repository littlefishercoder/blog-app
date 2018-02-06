package com.yjn.blog.base.utils;

import com.google.gson.Gson;

/**
 * @author yang.jianan
 * @date 2018/02/06 09:26.
 * Desc：Gson工具
 */

public class GsonUtil {
    private static Gson gson;

    public static Gson getInstance() {
        if (gson == null) {
            gson = new Gson();
        }
        return gson;
    }

}
