import fire_station.FireManager;
import working_server.ServerRequests;

public class Main {
    public static void main(String[] args) {
        FireManager fm = new FireManager();
        fm.checkFireStation();
        ServerRequests sr = new ServerRequests();
        try {
            sr.checkServer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
