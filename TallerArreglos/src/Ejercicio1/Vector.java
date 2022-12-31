package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vector {

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    private int[] numeros;

    public Vector(){
        this.numeros = new int[5];
    }

    public Vector(int tamanio) {
        this.numeros = new int[tamanio];
    }

    public int[] llenarVector() throws IOException {

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingresa un numero ");
            numeros[i] = Integer.parseInt(bfr.readLine());

        }
        return numeros;
    }

    public void listarFigura(int[] numeros) {

        System.out.println("");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("[" + i + "]" + " = " + numeros[i]);

        }
    }


 }

