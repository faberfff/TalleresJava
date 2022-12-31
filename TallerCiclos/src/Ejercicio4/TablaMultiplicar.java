package Ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TablaMultiplicar {

    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        int resultado;

        System.out.println("Ingresa el numero de la tabla a multiplicar ");
        numero = Integer.parseInt(bfr.readLine());

        for (int i = 1; i <= 10; i++) {
            resultado = i * numero;

            System.out.println(i + " " + "x" + " " + numero + " " + "=" + " " + resultado);
        }

    }
}
