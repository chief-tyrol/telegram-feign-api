package zone.gryphon.telegram.feign.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

/**
 * @author galen
 */
@Value
@Builder(toBuilder = true)
@AllArgsConstructor
public class Response<T> {

    private final boolean ok;

    private T result;

}
