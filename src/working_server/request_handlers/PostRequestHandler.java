package working_server.request_handlers;

import working_server.RequestCatcher;
import working_server.HttpMethods;

public class PostRequestHandler implements Runnable {
    @Override
    public void run() {
        RequestCatcher.processRequest("post", HttpMethods.POST);
    }
}
