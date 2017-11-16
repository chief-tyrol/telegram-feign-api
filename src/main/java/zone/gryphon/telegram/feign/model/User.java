package zone.gryphon.telegram.feign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

/**
 * This object represents a Telegram user or bot.
 * <a href="https://core.telegram.org/bots/api#user">https://core.telegram.org/bots/api#user</a>
 *
 * @author galen
 */
@Value
@Builder(toBuilder = true)
@AllArgsConstructor
public class User {

    /**
     * Unique identifier for this user or bot
     */
    private final Long id;

    /**
     * True, if this user is a bot
     */
    @JsonProperty("is_bot")
    private final Boolean isBot;

    /**
     * User‘s or bot’s first name
     */
    @JsonProperty("first_name")
    private final String firstName;

    /**
     * <i>Optional.</i>
     * <p>
     * User‘s or bot’s last name
     */
    @JsonProperty("last_name")
    private final String lastName;

    /**
     * <i>Optional.</i>
     * <p>
     * User‘s or bot’s username
     */
    private final String username;

    /**
     * <i>Optional.</i>
     * <p>
     * <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>
     * of the user's language
     */
    @JsonProperty("language_code")
    private final String languageCode;
}
