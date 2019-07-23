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
