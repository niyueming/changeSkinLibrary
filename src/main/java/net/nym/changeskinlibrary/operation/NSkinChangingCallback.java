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

/**
 * @author niyueming
 * @date 2017-03-14
 * @time 15:52
 */

public interface NSkinChangingCallback {

    void onStart();

    void onError(Exception e);

    void onComplete();

    public static SimpleSkinChangingCallback DEFAULT_SKIN_CHANGING_CALLBACK = new SimpleSkinChangingCallback();

    public class SimpleSkinChangingCallback implements NSkinChangingCallback
    {
        @Override
        public void onStart()
        {

        }

        @Override
        public void onError(Exception e)
        {
            e.printStackTrace();
        }

        @Override
        public void onComplete()
        {

        }
    }
}
