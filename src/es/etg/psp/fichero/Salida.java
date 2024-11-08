package es.etg.psp.fichero;

import es.etg.psp.entrada.Entrada;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public interface Salida {

    
    public  static File fichero = new File(Entrada.NOMBRE_TXT);

    
     static void escribir(String datos)  {
        try (FileOutputStream fout = new FileOutputStream(fichero, true)) {

           
              
                fout.write(datos.getBytes());
                fout.write(System.lineSeparator().getBytes());
            

        }catch (IOException e ){
            System.err.println(e);
        }
    }


    
    static  void vaciar() throws FileNotFoundException, IOException{
        try(FileOutputStream fout = new FileOutputStream(fichero, false)){
            
        }
    }

}
