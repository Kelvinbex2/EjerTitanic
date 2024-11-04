package es.etg.psp;
import es.etg.psp.Entrada.Entrada;


public class Barca {
    

    public static void main(String[] args) {
        try {
            crearBarcas();
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }

    public static int crearBarcas() throws InterruptedException {
        
        String[] numeroBarcas = new String[Entrada.NUM_POSICION];
        int total = 0;

        System.out.println(Tiem.date());
        
        for (int i = 0; i < Entrada.NUM_POSICION; i++) {
            int rand = 1 + (int) +(Math.random() * 100);

            numeroBarcas[i] = String.format(Entrada.NUM_BARCAS, i);
            
            Hilo hilo = new Hilo();
            Thread tiempo = new Thread(hilo);
            tiempo.start();

            System.out.println("Barca " + numeroBarcas[i] + Entrada.COMILLAS + rand);
   
            total += rand;
   
            tiempo.join();
            
        }
        
        System.out.println(String.format(Entrada.MSG_TOTAL, total));

        return total;
        
    }
}
