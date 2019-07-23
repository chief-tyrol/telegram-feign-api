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

package zone.gryphon.telegram.feign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

/**
 * This object represents an incoming update.
 * At most one of the optional parameters can be present in any given update.
 *
 * @author galen
 */
@Value
@Builder(toBuilder = true)
@AllArgsConstructor
public class Update {

    /**
     * The update‘s unique identifier.
     * Update identifiers start from a certain positive number and increase sequentially.
     * This ID becomes especially handy if you’re using
     * <a href="https://core.telegram.org/bots/api#setwebhook">Webhooks</a>,
     * since it allows you to ignore repeated updates or to restore the correct update sequence, should they get out of order.
     */
    @JsonProperty("update_id")
    private final long updateId;

    /**
     * <i>Optional.</i>
     * <p>
     * New incoming message of any kind — text, photo, sticker, etc.
     */
    private final Message message;

    /**
     * <i>Optional.</i>
     * <p>
     * New version of a message that is known to the bot and was edited
     */
    @JsonProperty("edited_message")
    private final Message editedMessage;

    /**
     * <i>Optional.</i>
     * <p>
     * New incoming channel post of any kind — text, photo, sticker, etc.
     */
    @JsonProperty("channel_post")
    private final Message channelPost;

    /**
     * <i>Optional.</i>
     * <p>
     * New version of a channel post that is known to the bot and was edited
     */
    @JsonProperty("edited_channel_post")
    private final Message editedChannelPost;

    /**
     * <i>Optional.</i>
     * <p>
     * New incoming
     * <a href="https://core.telegram.org/bots/api#inline-mode">inline</a>
     * query
     */
    @JsonProperty("inline_query")
    private final InlineQuery inlineQuery;

    /**
     * <i>Optional.</i>
     * <p>
     * The result of an
     * <a href="https://core.telegram.org/bots/api#inline-mode">inline</a>
     * query that was chosen by a user and sent to their chat partner.
     * Please see our documentation on the
     * <a href="https://core.telegram.org/bots/inline#collecting-feedback">feedback collecting</a>
     * for details on how to enable these updates for your bot.
     */
    @JsonProperty("chosen_inline_result")
    private final ChosenInlineResult chosenInlineResult;

    /**
     * <i>Optional.</i>
     * <p>
     * New incoming callback query
     */
    @JsonProperty("callback_query")
    private final CallbackQuery callbackQuery;

    /**
     * <i>Optional.</i>
     * <p>
     * New incoming shipping query. Only for invoices with flexible price
     */
    @JsonProperty("shipping_query")
    private final ShippingQuery shippingQuery;

    /**
     * <i>Optional.</i>
     * <p>
     * New incoming pre-checkout query.
     * Contains full information about checkout
     */
    @JsonProperty("pre_checkout_query")
    private final PreCheckoutQuery preCheckoutQuery;

}
