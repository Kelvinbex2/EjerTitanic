package es.etg.psp.salida;

public interface RegistroFactory {
    
   public  static Registro elegir(TipoRegistro tipo){

        if(tipo==TipoRegistro.CONSOLA){

            return new RegistroConsola();

        }  if(tipo ==TipoRegistro.MD){

            return  new RegistroFichero();
        }else{
            return new RegistroFicheroTxt();
        }
           

    }
    
}
