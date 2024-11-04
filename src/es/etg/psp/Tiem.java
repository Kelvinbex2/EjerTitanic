package es.etg.psp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import es.etg.psp.Entrada.Entrada;

public class Tiem {

    public static String date() {

        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern(Entrada.MSG_TIEMPO);
        String fechaHoraFormateada = localDate.format(formateador);
        String msg = Entrada.MSG_SALIDA_TIEMPO + fechaHoraFormateada;

        return msg;
    }
}