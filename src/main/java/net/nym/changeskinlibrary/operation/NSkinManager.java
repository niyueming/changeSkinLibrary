/*
 * Copyright (c) 2017  Ni YueMing<niyueming@163.com>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 *
 */

package net.nym.changeskinlibrary.operation;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

/**
 * @author niyueming
 * @date 2017-03-14
 * @time 14:55
 */

public interface NSkinManager<M> {

    M getManager();

    /**
     * 插件皮肤和应用内皮肤切换
     * @param listener
     */
    void switchSkinMode(NOnSkinChangeListener listener);

    void refreshSkin(NOnSkinChangeListener listener);

    void changeSkin(String skinPath, String skinPkgName, String suffix,NOnSkinChangeListener listener);

    /**
     * 更换皮肤后缀
     * @param suffix 多套皮肤以后缀就行区别，比如：main_bg，皮肤资源可以为：main_bg_red,main_bg_green等。
     *               换肤时，直接传入后缀，例如上面描述的red,green。
     * @param listener
     */
    void changeSkin(String suffix,NOnSkinChangeListener listener);

    /**
     *  在需要换肤的{@link Activity#onCreate(Bundle)}中注册
     */
    void register(Activity activity);

    /**
     * 在{@link Activity#onDestroy()}中注销
     */
    void unregister(Activity activity);

    /**
     * 用于动态添加的view自动加当前皮肤
     * @param view
     */
    void injectSkin(View view);

    /**
     * 恢复默认（还带后缀）
     */
    void restoreDefault(NOnSkinChangeListener listener);

    /**
     * 恢复默认
     */
    void clear();
}
