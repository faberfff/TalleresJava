package Ejercicio8;

import Ejercicio7.Vehiculo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Main8 {

    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        boolean salir = false;
        int opcion;

        String nombre;
        String telefono;
        boolean aprobo;

        EscuelaConduccion escuelaConduccion = new EscuelaConduccion(8);

        Usuario user;
        Usuario users[] = new Usuario[8] ;

        while (!salir) {

            System.out.println("");
            System.out.println("           Escuela automovilística El Maestro   ");
            System.out.println("");
            System.out.println("1. Ingresar al curso");
            System.out.println("2. Listar ingreso al curso");
            System.out.println("3. Consultar Resultados");
            System.out.println("4. Salir");

            try {
                System.out.println("");
                System.out.println("Escribe una de las opciones");
                opcion = Integer.parseInt(bfr.readLine());

                switch (opcion) {
                    case 1:
                        System.out.println("");
                        System.out.println("Digita tu nombre");
                        nombre = bfr.readLine();

                        System.out.println("Digita el numero telefono");
                        telefono = bfr.readLine();


                        user = new Usuario (nombre, telefono);

                        escuelaConduccion.registrarCurso(user);
                        if (escuelaConduccion.evaluarCuposDisponibles()) {
                            System.out.println("En el momento no hay cupos disponibles ");
                            System.out.println("");
                        } else {
                            System.out.println("Aun hay cupos disponibles ");
                            System.out.println("");
                        }

                        break;
                    case 2:

                        System.out.println("");
                        escuelaConduccion.listarPresentesEnCurso();


                        break;
                    case 3:

                        System.out.println("Ingresa tu nombre ");
                        nombre = bfr.readLine();
                        user = new Usuario(nombre);
                        escuelaConduccion.presentarPrueba(user);

                        break;


                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                bfr.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
