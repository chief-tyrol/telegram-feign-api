package zone.gryphon.telegram.feign;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import zone.gryphon.telegram.feign.model.Message;
import zone.gryphon.telegram.feign.model.Response;
import zone.gryphon.telegram.feign.model.Update;
import zone.gryphon.telegram.feign.model.User;
import zone.gryphon.telegram.feign.write.SendMessageRequest;

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
