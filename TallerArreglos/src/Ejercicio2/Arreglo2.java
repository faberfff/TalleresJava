package Ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arreglo2 {

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    private int[] numeros;

    public Arreglo2(){
        this.numeros = new int[20];
    }

    public Arreglo2(int tamanio) {
        this.numeros = new int[tamanio];
    }

    public int[] llenarVectorAleatorios() throws IOException {
        int numeroAleatorio = 0;
        int i = 0;

        while (i < 20) {
            numeroAleatorio = (int) (Math.random() * 100 + 1);
            numeros[i] = numeroAleatorio;

            System.out.println(numeros[i]);
            System.out.print("");
            i = i + 1;
        }
        return numeros;
    }

    public void mostarNPares(int[] numeros) throws IOException {

        System.out.print("Números pares: ");
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0) {
                System.out.print( numeros[i] + ", ");
            }
        }
        System.out.print("");
    }

    public void mostarInpares(int[] numeros) throws IOException {

        System.out.println("");
        System.out.print("Números Impares: ");
        for (int i = 0; i < numeros.length; i++) {

            if(numeros[i] % 2 != 0) {
                System.out.print( numeros[i] + ", ");
            }
        }
    }
}
