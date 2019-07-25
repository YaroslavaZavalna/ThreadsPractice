package fire_station;

import java.util.*;

public class FireManager {

    public void checkFireStation(){
        Station1 s1 = new Station1();
        Station2 s2 = new Station2();
        Thread t1;
        Thread t2;
        List<Character> fires = createMapOfDistricsOnFire();
        if(fires.size()==1){
            (new Thread(s1)).start();
        }else{
            for (int i = 0; i < fires.size(); i++) {
                if(i%2==0){
                    (t1 = new Thread(s1)).start();
                    try {
                        t1.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    (t2 = new Thread(s2)).start();
                    try {
                        t2.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println("All fires were extinguished!\n");
    }
    private static List<Character> createMapOfDistricsOnFire(){
        List<Character>listOfF = new ArrayList<>();
        char[] arr = createDistricStatuses();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=='f'){
                listOfF.add('f');
            }
        }
        System.out.println("Today`s quantity of fires is "+ listOfF.size());
        return listOfF;
    }
    private static char[] createDistricStatuses(){
        Random r = new Random();
        String statuses = "of";
        char[] districStatus = new char[10];
        for (int i = 0; i < districStatus.length; i++) {
            char c = statuses.charAt(r.nextInt(statuses.length()) );
            districStatus[i]=c;
        }
        return districStatus;
    }
}
