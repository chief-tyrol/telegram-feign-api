package zone.gryphon.telegram.feign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.List;

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
    private Long messageId;

    private User from;

    private Long date;

    private Chat chat;

    @JsonProperty("forward_from")
    private User forwardFrom;

    private Chat forwardFromChat;

    private Long forwardFromMessageId;

    private String forwardSignature;

    private Long forwardDate;

    private Message replyToMessage;

    private Long editDate;

    private String authorSignature;

    private String text;

    private List<MessageEntity> entities;

    private List<MessageEntity> captionEntities;

    private Audio audio;

    private Document document;

    // TODO


}
