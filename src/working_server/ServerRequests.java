package working_server;

import working_server.request_handlers.DeleteRequestHandler;
import working_server.request_handlers.GetRequestHandler;
import working_server.request_handlers.PostRequestHandler;
import working_server.request_handlers.PutRequestHandler;

public class ServerRequests {
    public void checkServer() throws InterruptedException {
        GetRequestHandler getHandler = new GetRequestHandler();
        Thread thread1 = new Thread(getHandler);
        thread1.start();
        thread1.join();

        PostRequestHandler postHandler = new PostRequestHandler();
        Thread thread2 = new Thread(postHandler);
        thread2.start();
        thread2.join();

        PutRequestHandler putHandler = new PutRequestHandler();
        Thread thread3 = new Thread(putHandler);
        thread3.start();
        thread3.join();

        DeleteRequestHandler deleteHandler = new DeleteRequestHandler();
        Thread thread4 = new Thread(deleteHandler);
        thread4.start();
        thread4.join();
    }
}
