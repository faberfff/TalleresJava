package Ejercicio2;

import java.util.Scanner;

public class MenorEdad {

    Scanner lector = new Scanner(System.in);

    public void evaluarEdad(){

        int edad;

        System.out.println("Ingresa tu edad");
        edad = lector.nextInt();

        if(edad < 18) {
            System.out.println("Usted aún es un niño(a).");
        }
    }
}
