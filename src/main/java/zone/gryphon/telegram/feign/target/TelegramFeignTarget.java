package zone.gryphon.telegram.feign.target;

import feign.Request;
import feign.RequestTemplate;
import feign.Target;
import lombok.NonNull;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author galen
 */

public class TelegramFeignTarget<T> implements Target<T> {

    private final Class<T> type;

    private final String name;

    private final String url;

    private final Map<String, String> tokenMap;

    @java.beans.ConstructorProperties({"type", "url", "token"})
    public TelegramFeignTarget(Class<T> type, String url, String token) {
        this(type, url, url, token);
    }

    @java.beans.ConstructorProperties({"type", "name", "url", "token"})
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

        if(requestTemplate.url().indexOf("http") != 0) {
            requestTemplate.insert(0, url());
        }

        requestTemplate.resolve(tokenMap);

        return requestTemplate.request();
    }
}
