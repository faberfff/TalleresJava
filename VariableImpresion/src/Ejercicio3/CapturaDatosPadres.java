package Ejercicio3;

import java.util.Scanner;

public class CapturaDatosPadres {

    Scanner lector = new Scanner(System.in);

    public void imprimirDatos() {
        String nombre;
        String nombreP;
        String nombreM;

        System.out.println("Digita tu nombre completo");
        nombre = lector.nextLine();

        System.out.println("Digita nombre completo de la madre");
        nombreM = lector.nextLine();

        System.out.println("Digita tu edad");
        nombreP = lector.nextLine();


        System.out.println( " Yo "+ nombre + " soy hijo de " + nombreM + " y " +nombreP );

    }

}
