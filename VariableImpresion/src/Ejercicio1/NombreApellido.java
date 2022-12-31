package Ejercicio1;

import java.util.Scanner;

public class NombreApellido {


   Scanner lector = new Scanner(System.in);


    public void capturarNombre(){

        String nombre;
        String apellido;

        System.out.println("Digita tu nombre");
        nombre = lector.nextLine();

        System.out.println("Digita tu Apellido");
        apellido = lector.nextLine();
        System.out.println(nombre + " " + apellido);
    }


}
