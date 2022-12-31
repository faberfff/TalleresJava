package Ejercicio9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9 {

    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int opcion;

        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        Trapecio trapecio = new Trapecio();
        opcion = 4;
        do {
            System.out.println("");
            System.out.println("     Areas de figuras geometricas ");
            System.out.println("");
            System.out.println("1. Calcular area Rectangulo ");
            System.out.println("2. Calcular area Triangulo ");
            System.out.println("3. Calcular area Trapecio");
            System.out.println("4. Salir ");
            System.out.print("Ingresa la opcion: ");
            opcion = Integer.parseInt(bfr.readLine());

            switch (opcion){
                case 1:{
                    rectangulo.calcularArea();
                    break;
                }
                case 2:{
                    triangulo.calcularArea();
                    break;
                }
                case 3:{
                    trapecio.calcularArea();
                    break;
                }

            }
        }while (opcion !=4);

    }
}
