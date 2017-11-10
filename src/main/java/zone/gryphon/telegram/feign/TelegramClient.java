package zone.gryphon.telegram.feign;

import feign.RequestLine;
import zone.gryphon.telegram.feign.model.Response;
import zone.gryphon.telegram.feign.model.Update;

/**
 * @author galen
 */
public interface TelegramClient {

    @RequestLine("GET /bot{token}/getUpdates")
    Response<Update> getUpdates();

}
