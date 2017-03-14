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

/**
 * @author niyueming
 * @date 2017-03-14
 * @time 14:55
 */

public interface NSkinManager<M> {

    M getManager();

    void switchSkinMode(NOnSkinChangeListener listener);

    void refreshSkin(NOnSkinChangeListener listener);

    /**
     *  在需要换肤的{@link Activity#onCreate(Bundle)}中注册
     * @param context
     */
    void register(Context context);

    /**
     * 在{@link Activity#onDestroy()}中注销
     * @param context
     */
    void unregister(Context context);
}
