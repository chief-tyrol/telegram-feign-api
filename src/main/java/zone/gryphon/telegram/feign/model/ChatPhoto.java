package zone.gryphon.telegram.feign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

/**
 * This object represents a chat photo.
 *
 * <a href="https://core.telegram.org/bots/api#chatphoto">https://core.telegram.org/bots/api#chatphoto</a>
 *
 * @author galen
 */
@Value
@Builder(toBuilder = true)
@AllArgsConstructor
public class ChatPhoto {

    /**
     * Unique file identifier of small (160x160) chat photo.
     * This file_id can be used only for photo download.
     */
    @NonNull
    @JsonProperty("small_file_id")
    private final String smallFileId;

    /**
     * Unique file identifier of big (640x640) chat photo.
     * This file_id can be used only for photo download.
     */
    @NonNull
    @JsonProperty("big_file_id")
    private final String bigFileId;

}
