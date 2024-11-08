package es.etg.psp.barca;

import es.etg.psp.Tiempo;
import es.etg.psp.entrada.Entrada;
import es.etg.psp.fichero.Salida;
import es.etg.psp.salida.Registro;
import es.etg.psp.salida.RegistroFactory;
import es.etg.psp.salida.TipoRegistro;
import java.io.IOException;

public class GestorBarca implements Salida,RegistroFactory{
   private static final TipoRegistro tipoRegistro=TipoRegistro.CONSOLA;
   private static final Registro registro =RegistroFactory.elegir(tipoRegistro);


   public static int Simular() throws InterruptedException, IOException {
       
        String[] numeroBarcas = new String[Entrada.NUM_POSICION];
        int total = 0;
    
        Salida.vaciar();
        String fechaAtual = Tiempo.date();
        registro.imprimir(fechaAtual);
        int time = (int) (Math.random() * (6000 - 2000 + 1) + 2000);
        
        for (int i = 0; i < Entrada.NUM_POSICION; i++) {
            String nombreBarca = String.format(Entrada.NUM_BARCAS, i);
            
            Barca barca = new Barca(nombreBarca);
            int rand = barca.getSuperviviente();
            numeroBarcas[i] = nombreBarca;
            
            Thread.sleep(time);
            String linea = Entrada.BARCAS + numeroBarcas[i] + Entrada.COMILLAS + rand;
           
            registro.imprimir(linea);
            total += rand;
   
            
            
        }
       

        String msgtotal = Entrada.MSG_TOTAL;
        String consola = String.format(msgtotal, total);
        registro.imprimir(consola);
        return total;
        
    } 


    public static void main(String[] args) {
        try {
            Simular();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}