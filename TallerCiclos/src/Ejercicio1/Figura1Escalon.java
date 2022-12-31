package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Figura1Escalon {

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

    public void mostrarFigura() throws IOException {

        int numero;
        System.out.println("Ingrsa un numero");
        numero = Integer.parseInt(bfr.readLine());

        for (int i = 0; i < numero; i++) {
            for(int j = 0; j <= i - 1; j++) {
                System.out.print(" *");
            }

            System.out.println("");

        }
    }
}
