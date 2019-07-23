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

package zone.gryphon.telegram.feign;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import zone.gryphon.telegram.feign.model.Message;
import zone.gryphon.telegram.feign.model.Response;
import zone.gryphon.telegram.feign.model.Update;
import zone.gryphon.telegram.feign.model.User;
import zone.gryphon.telegram.feign.model.write.SendMessageRequest;

import java.util.List;

/**
 * @author galen
 */
@Headers("Accept: application/json")
public interface TelegramClient {

    /**
     * A simple method for testing your bot's auth token.
     * Requires no parameters.
     * Returns basic information about the bot in form of a User object.
     *
     * @return
     */
    @RequestLine("GET /bot{token}/getMe")
    Response<User> getMe();

    @RequestLine("GET /bot{token}/getUpdates?offset={offset}&timeout={timeout}")
    Response<List<Update>> getUpdates(@Param("offset") long offset, @Param("timeout") long timeout);

    @Headers("Content-Type: application/json")
    @RequestLine("POST /bot{token}/sendMessage")
    Response<Message> sendMessage(SendMessageRequest sendMessageRequest);


}
