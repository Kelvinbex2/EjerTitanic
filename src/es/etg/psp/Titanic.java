package es.etg.psp;

import java.io.IOException;
import es.etg.psp.Entrada.Entrada;

public class Titanic {

    private static final String[] COMMANDO = {"java", "es.etg.psp.GestorTitanic"};

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
