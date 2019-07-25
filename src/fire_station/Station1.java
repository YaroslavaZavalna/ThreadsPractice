package fire_station;

import java.util.concurrent.Callable;

public class Station1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Firefighters from station 1 are ready!");
    }

}
