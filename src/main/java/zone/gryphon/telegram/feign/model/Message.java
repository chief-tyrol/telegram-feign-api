package zone.gryphon.telegram.feign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

/**
 * This object represents a message.
 *
 * @author galen
 */
@Value
@Builder(toBuilder = true)
@AllArgsConstructor
public class Message {

    @JsonProperty("message_id")
    private long messageId;

}
