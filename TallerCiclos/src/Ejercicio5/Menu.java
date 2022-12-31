package Ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    private int opcion = 0;
    private String nombre;
    private String saludo;

   public void mostrarMenu() throws IOException {

       int opcion = 3;
       do {
           System.out.println("        Menú de Usuario");
           System.out.println("");
           System.out.println("1. Capturar nombre ");
           System.out.println("2. Saludar persona ");
           System.out.println("3. Salir sistema ");
           System.out.println("");
           System.out.println("Digita la opcion que desee");
           opcion = Integer.parseInt(bfr.readLine());

           evaluarOpcion(opcion);

       }while (opcion != 3);

   }
    private void evaluarOpcion(int opcion) throws IOException {

        switch (opcion){
            case 1:{
                System.out.println("Digita tu nombre completo");
                nombre = bfr.readLine();

            }break;

            case 2:{
                System.out.println("Hola señor(a) " + nombre + " Bienvenido(a) a nuestro programa ");

            }break;

        }

    }


}
