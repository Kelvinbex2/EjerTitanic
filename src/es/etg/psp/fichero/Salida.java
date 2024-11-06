package es.etg.psp.fichero;

import es.etg.psp.Tiem;
import es.etg.psp.Entrada.Entrada;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Salida {

    String fechaAtual = Tiem.date();
    File fichero = new File(Entrada.NOMBRE_FICHERO);
    public void escribirSalida(String datos) throws IOException {
        try (FileOutputStream fout = new FileOutputStream(fichero, true)) {

           if (!fichero.exists() || fichero.length()==0) {
            fout.write(fechaAtual.getBytes());
            fout.write(System.lineSeparator().getBytes());
           }
              
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
