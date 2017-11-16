package zone.gryphon.telegram.feign.write;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

/**
 * @author galen
 */
@Value
@Builder(toBuilder = true)
@AllArgsConstructor
public class SendMessageRequest {

    /**
     * Unique identifier for the target chat
     */
    @NonNull
    @JsonProperty("chat_id")
    private final Long chatId;

    /**
     *  Text of the message to be sent
     */
    @NonNull
    private final String text;

    /**
     * Send
     * <a href="https://core.telegram.org/bots/api#markdown-style">Markdown</a>
     * or
     * <a href="https://core.telegram.org/bots/api#html-style">HTML</a>,
     * if you want Telegram apps to show
     * <a href="https://core.telegram.org/bots/api#formatting-options">bold, italic, fixed-width text or inline URLs</a>
     * in your bot's message.
     */
    @JsonProperty("parse_mode")
    private final String parseMode;

    /**
     * Disables link previews for links in this message
     */
    @JsonProperty("disable_web_page_preview")
    private final Boolean disableWebPagePreview;

    /**
     * Sends the message
     * <a href="https://telegram.org/blog/channels-2-0#silent-messages">silently</a>.
     * Users will receive a notification with no sound.
     */
    @JsonProperty("disable_notification")
    private final Boolean disableNotification;

    /**
     * If the message is a reply, ID of the original message
     */
    @JsonProperty("reply_to_message_id")
    private final Long replyToMessageId;

    // TODO reply_markup
}
