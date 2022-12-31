package Ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        FiguraArbol figuraArbol = new FiguraArbol();
        figuraArbol.mostrarFigura3();

        System.out.println("          *** ");
        System.out.println("          *** ");
        System.out.println("         ***** ");
        System.out.println("        ******* ");
    }
}
