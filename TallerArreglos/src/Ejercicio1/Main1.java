package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        Vector vector = new Vector(5);
        int numeros[] = new int[5];
        Vector vector1 = new Vector();
        numeros = vector1.llenarVector();
        vector1.listarFigura(numeros);
    }
}
