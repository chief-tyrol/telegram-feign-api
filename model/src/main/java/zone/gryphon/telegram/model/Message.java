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
