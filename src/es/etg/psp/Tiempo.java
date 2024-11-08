package es.etg.psp;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Tiempo {

  public static String date() {
        return new SimpleDateFormat("dd/MM/yyyy 'a las' HH:mm:ss").format(new Date());
    }
}