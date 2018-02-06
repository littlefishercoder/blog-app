/*
 * Copyright (c) 2016 咖枯 <kaku201313@163.com | 3772304@qq.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.yjn.blog.base.api;

/**
 * @author yang.jianan
 * @date 2018/02/06 09:26.
 * Desc：请求类型
 */
public class HostType {

    /**
     * 多少种Host类型
     */
    public static final int TYPE_COUNT = 3;

    /**
     * 测试的的host
     */
    public static final int TYPE_BAIDU = 1;

    /**
     * 身份证识别的host
     */
    public static final int TYPE_ID_CARD = 2;

    /**
     * APP接口的host
     */
    public static final int TYPE_APP = 3;

    /**
     * APP上传文件host
     */
    public static final int TYPE_FILE_UPLOAD = 4;


}
