package Ejercicio2;

import Ejercicio1.Vector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        Arreglo2 arreglo2 = new Arreglo2();
        int numeros[] = new int[20];

        System.out.println("Numeros aleatorios");
        System.out.print("");
        numeros = arreglo2.llenarVectorAleatorios();
        /*System.out.println("Numeros pares del vector aleatorio");
        System.out.print("");*/
        arreglo2.mostarNPares(numeros);
       /* System.out.println("Numeros impares del vector aleatorio");
        System.out.print("");*/
        arreglo2.mostarInpares(numeros);

    }



}
