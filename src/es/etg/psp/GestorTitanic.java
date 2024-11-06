package es.etg.psp;

import es.etg.psp.Entrada.Entrada;
import es.etg.psp.fichero.Salida;
import java.io.IOException;

public class GestorTitanic {

   public static int crearBarcas() throws InterruptedException, IOException {
        
        String[] numeroBarcas = new String[Entrada.NUM_POSICION];
        int total = 0;
        Salida salida = new Salida();

        System.out.println(Tiem.date());
        
        for (int i = 0; i < Entrada.NUM_POSICION; i++) {
            String nombreBarca = String.format(Entrada.NUM_BARCAS, i);
            Barca barca = new Barca(nombreBarca);
            int rand = barca.getSuperviviente();
            numeroBarcas[i] = nombreBarca;
            
            Hilo hilo = new Hilo();
            Thread tiempo = new Thread(hilo);
            tiempo.start();

            String linea = Entrada.BARCAS + numeroBarcas[i] + Entrada.COMILLAS + rand;
            System.out.println(linea);
   
            salida.escribirSalida(linea);
            total += rand;
   
            tiempo.join();
            
        }
        String msgtotal = Entrada.MSG_TOTAL;
        String consola = String.format(msgtotal, total);
        System.out.println(consola);
        salida.escribirTotal(consola);

        return total;
        
    } 
    public static void main(String[] args) {
        try {
            //crearBarcas();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}