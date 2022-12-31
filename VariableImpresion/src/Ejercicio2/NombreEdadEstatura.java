package Ejercicio2;

import java.util.Scanner;

public class NombreEdadEstatura {

Scanner lector = new Scanner(System.in);

    public void capturarDatos(){

        String nombre;
        String apellido;
        int edad;
        Double estatura;

        System.out.println("Digita tu nombre");
        nombre = lector.nextLine();

        System.out.println("Digita tu Apellido");
        apellido = lector.nextLine();

        System.out.println("Digita tu edad");
        edad = lector.nextInt();

        System.out.println("Digita tu estatura");
        estatura = lector.nextDouble();

        System.out.println( " Mi nombre es "+ nombre + " " + apellido + " Tengo " + edad + " años de edad, mido " + estatura + " de estatura");
    }
}
