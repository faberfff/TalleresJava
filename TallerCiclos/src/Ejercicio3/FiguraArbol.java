package Ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiguraArbol {

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    public void mostrarFigura3() throws IOException {


        int numero = 12;

        for (int i = 0; i < numero; i++) {
            for(int j = numero - 1 -i; j >= 0; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");

        }

    }
}
