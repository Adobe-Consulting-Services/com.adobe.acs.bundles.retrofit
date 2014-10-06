/*
 * #%L
 * ACS AEM Retrofit Bundle
 * %%
 * Copyright (C) 2014 Adobe
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.adobe.acs.bundles.retrofit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import retrofit.RestAdapter.Log;

/**
 * Adapter for the Retrofit log system which logs to SLF4J using the static
 * log category name 'retrofit'.
 */
public class Slf4jLog implements Log {

    private Slf4jLog() {
    }

    private static final Logger log = LoggerFactory.getLogger("retrofit");

    public void log(String message) {
        log.info(message);
    }

    public static Slf4jLog INSTANCE;

    static {
        INSTANCE = new Slf4jLog();
    }

}
