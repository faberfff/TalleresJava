package Ejercicio5;

import java.util.Scanner;

public class Mascota {

    Scanner lector = new Scanner(System.in);

    public void imprimirDatos() {
        String nombreMascota;
        int edadMascota;
        String tipoMascota;
        String nombrePersona;

        System.out.println("Digita tu nombre de su mascota");
        nombreMascota = lector.nextLine();

        System.out.println("Digita la edad de la mascota");
        edadMascota = lector.nextInt();

        System.out.println("Digita el tipo de mascota");
        tipoMascota = lector.next();

        System.out.println("Digita el nombre del propietario");
        nombrePersona = lector.next();


        System.out.println( nombreMascota + " es un(a) " + tipoMascota +
                ", el cual, tiene " +edadMascota + " años de edad y "
                + nombrePersona + " es actualmente su dueño(a)" );

    }
}
