package es.etg.psp;

import java.util.concurrent.ThreadLocalRandom;

public class Hilo  implements Runnable{

    @Override
    public void run() {
        
        int time = ThreadLocalRandom.current().nextInt(2000, 6001);

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    
}
