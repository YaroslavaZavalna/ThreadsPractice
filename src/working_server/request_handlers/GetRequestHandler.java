package working_server.request_handlers;

import working_server.RequestCatcher;
import working_server.HttpMethods;

public class GetRequestHandler implements Runnable {
    @Override
    public void run() {
        RequestCatcher.processRequest("get", HttpMethods.GET);

    }
}
