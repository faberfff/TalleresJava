package Ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        Drogueria drogueria = new Drogueria();
        drogueria.listaProductos();
        drogueria.mostrarMenu();

    }
}
