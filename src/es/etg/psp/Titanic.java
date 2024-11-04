package es.etg.psp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import es.etg.psp.Entrada.Entrada;

public class Titanic {

    private static final String[] COMMANDO = { "java", "-cp", "bin", "es.etg.psp.Barca" };

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
            StringBuilder build = new StringBuilder();

            BufferedReader bf = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = Entrada.COMILLAS_SIMPLE;
            while ((line = bf.readLine()) != null) {
                // build.append(line).append(Entrada.TABULADOR);
                System.err.println(line);
            }

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
