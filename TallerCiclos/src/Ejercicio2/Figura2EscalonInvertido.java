package Ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Figura2EscalonInvertido {

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

    public void mostrarFigura2() throws IOException {

        int numero;
        System.out.println("Ingrsa un numero");
        numero = Integer.parseInt(bfr.readLine());

        for (int i = 0; i < numero; i++) {
            for(int j = numero - 1 -i; j >= 0; j--) {
                System.out.print("  ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
