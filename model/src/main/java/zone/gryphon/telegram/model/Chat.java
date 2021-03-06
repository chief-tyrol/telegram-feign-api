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

package zone.gryphon.telegram.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

/**
 * This object represents a chat.
 * <p>
 * <a href="https://core.telegram.org/bots/api#chat">https://core.telegram.org/bots/api#chat</a>
 *
 * @author galen
 */
@Value
@Builder(toBuilder = true)
@AllArgsConstructor
public class Chat {

    /**
     * Unique identifier for this chat.
     */
    @NonNull
    private final Long id;

    /**
     * Type of chat, can be either “private”, “group”, “supergroup” or “channel”
     */
    @NonNull
    private final String type;

    /**
     * <i>Optional.</i>
     * <p>
     * Title, for supergroups, channels and group chats
     */
    private final String title;

    /**
     * <i>Optional.</i>
     * <p>
     * Username, for private chats, supergroups and channels if available
     */
    private final String username;

    /**
     * <i>Optional.</i>
     * <p>
     * First name of the other party in a private chat
     */
    private final String firstName;

    /**
     * <i>Optional.</i>
     * <p>
     * Last name of the other party in a private chat
     */
    private final String lastName;

    /**
     * <i>Optional.</i>
     * <p>
     * True if a group has ‘All Members Are Admins’ enabled.
     */
    private final Boolean allMembersAreAdministrators;

    /**
     * <i>Optional.</i>
     * <p>
     * Chat photo. Returned only in getChat.
     */
    private ChatPhoto photo;

    /**
     * <i>Optional.</i>
     * <p>
     * Description, for supergroups and channel chats.
     * Returned only in getChat.
     */
    private final String description;

    /**
     * <i>Optional.</i>
     * <p>
     * Chat invite link, for supergroups and channel chats.
     * Returned only in getChat.
     */
    private final String inviteLink;

    /**
     * <i>Optional.</i>
     * <p>
     * Pinned message, for supergroups.
     * Returned only in getChat.
     */
    private final Message pinnedMessage;

    /**
     * <i>Optional.</i>
     * <p>
     * For supergroups, name of group sticker set.
     * Returned only in getChat.
     */
    private final String stickerSetName;

    /**
     * <i>Optional.</i>
     * <p>
     * True, if the bot can change the group sticker set.
     * Returned only in getChat.
     */
    private final Boolean canSetStickerSet;

}
