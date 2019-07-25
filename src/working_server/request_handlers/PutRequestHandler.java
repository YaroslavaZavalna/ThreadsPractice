package working_server.request_handlers;

import working_server.RequestCatcher;
import working_server.HttpMethods;

public class PutRequestHandler implements Runnable {
    @Override
    public void run() {
        RequestCatcher.processRequest("put", HttpMethods.PUT);
    }
}
