package es.etg.psp;

import es.etg.psp.entrada.Entrada;
import java.io.IOException;

public class Titanic {

    private static final String[] COMMANDO = {"java", "es/etg/psp/GestorBarca"};

    public static void main(String[] args) {
        try {
            ejecutar();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static int ejecutar() {
        int exitVal = 0;

        try {
            Process process = Runtime.getRuntime().exec(COMMANDO);
            exitVal = process.waitFor();

            if (exitVal == 0) {
                System.out.println(Entrada.MSG_BUENO_SALIDA);
            } else {

                System.out.println(Entrada.MSG_MALO_SALIDA);
            }

        } catch (IOException | InterruptedException e) {
            System.out.println(e);
        }

        return exitVal;
    }
}
