package working_server;

public class RequestCatcher {

    private String request;
    private HttpMethods httpMethod;

    public RequestCatcher(String request, HttpMethods httpMethod){
        this.request = request;
        this.httpMethod = httpMethod;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String requestBody) {
        this.request = requestBody;
    }

    public HttpMethods getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(HttpMethods httpMethod) {
        this.httpMethod = httpMethod;
    }

    public static void processRequest(String requestBody, HttpMethods httpMethod) {
        new RequestCatcher(requestBody,httpMethod);
        for (int i = 0; i < 3; i++) {
            System.out.println( "Request " + requestBody + " is handling in thread "+ Thread.currentThread());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
