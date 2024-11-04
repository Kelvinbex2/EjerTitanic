package es.etg.psp;

import java.util.Random;

public class Hilo  implements Runnable{

    @Override
    public void run() {
        Random rand = new Random();
        int time = 2000 + rand.nextInt(4000);

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    
}
