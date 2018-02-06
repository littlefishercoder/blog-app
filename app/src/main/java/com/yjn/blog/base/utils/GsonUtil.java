package com.cct.gridproject_android.base.utils;

import com.google.gson.Gson;

/**
 * Created by QinZB on 2017/12/13.
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
