/*
 * Copyright 2019-2019 Gryphon Zone
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
 */

package zone.gryphon.telegram.feign;

import feign.Request;
import feign.RequestTemplate;
import feign.Target;
import lombok.NonNull;
import lombok.ToString;

import java.beans.ConstructorProperties;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author galen
 */
@ToString
public class TelegramFeignTarget<T> implements Target<T> {

    private final Class<T> type;

    private final String name;

    private final String url;

    private final Map<String, String> tokenMap;

    @ConstructorProperties({"type", "url", "token"})
    public TelegramFeignTarget(Class<T> type, String url, String token) {
        this(type, url, url, token);
    }

    @ConstructorProperties({"type", "name", "url", "token"})
    public TelegramFeignTarget(@NonNull Class<T> type, @NonNull String name, @NonNull String url, @NonNull String token) {
        this.type = type;
        this.name = name;
        this.url = url;

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        tokenMap = Collections.unmodifiableMap(map);
    }

    @Override
    public Class<T> type() {
        return type;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public Request apply(RequestTemplate requestTemplate) {

        if (requestTemplate.url().indexOf("http") != 0) {
            requestTemplate.insert(0, url());
        }

        requestTemplate.resolve(tokenMap);

        return requestTemplate.request();
    }
}
