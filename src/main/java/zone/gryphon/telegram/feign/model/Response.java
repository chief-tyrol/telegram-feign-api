package zone.gryphon.telegram.feign.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.List;

/**
 * @author galen
 */
@Value
@Builder(toBuilder = true)
@AllArgsConstructor
public class Response<T> {

    private final boolean ok;

    private List<T> result;

}
