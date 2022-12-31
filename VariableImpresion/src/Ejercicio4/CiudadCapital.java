package Ejercicio4;

import java.util.Scanner;

public class CiudadCapital {

    Scanner lector = new Scanner(System.in);

    public void imprimirCiudad() {
        String ciudadCapital;
        String pais;

        System.out.println("Digita el nombre de la ciudad");
        ciudadCapital = lector.nextLine();

        System.out.println("Digita el nombre del pais");
        pais = lector.nextLine();


        System.out.println( "La ciudad "+ ciudadCapital + " es la capital del país " + pais );

    }
}
