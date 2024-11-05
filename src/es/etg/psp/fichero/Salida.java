package es.etg.psp.fichero;

import es.etg.psp.Entrada.Entrada;
import java.io.FileOutputStream;
import java.io.IOException;

public class Salida {

    
    public void escribirSalida(String datos) throws IOException {
        try (FileOutputStream fout = new FileOutputStream(Entrada.NOMBRE_FICHERO, true)) {
           
            fout.write(datos.getBytes());
            fout.write(System.lineSeparator().getBytes());
        }
    }

    public void escribirTotal(String datos) throws IOException {
        try (FileOutputStream fout = new FileOutputStream(Entrada.NOMBRE_FICHERO, true)) {

            fout.write(datos.getBytes());
            fout.write(System.lineSeparator().getBytes());
        }
    }

}
