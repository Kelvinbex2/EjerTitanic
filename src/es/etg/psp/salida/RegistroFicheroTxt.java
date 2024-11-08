package es.etg.psp.salida;

import es.etg.psp.fichero.Salida;

public class RegistroFicheroTxt extends  Registro implements  Salida{

    @Override
    public void imprimir(String salida) {
       Salida.escribir(salida); 
    }
    
}
