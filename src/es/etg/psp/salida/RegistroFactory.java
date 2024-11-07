package es.etg.psp.salida;

public interface RegistroFactory {
    
    static Registro elegir(TipoRegistro tipo){

        if(tipo==TipoRegistro.CONSOLA){

            return new RegistroConsola();

        }else{

            return  new RegistroFichero();
        }
           

    }
    
}
