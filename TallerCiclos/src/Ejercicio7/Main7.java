package Ejercicio7;

import Ejercicio6.Contacto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Main7 {

    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        boolean salir = false;
        int opcion;

        Parqueadero parqueadero = new Parqueadero(5);

        String placa;
        String marca;
        String nombreCliente;
        String numeroTelefono;

        Vehiculo vehiculo;


        while (!salir) {

            System.out.println("");
            System.out.println("           Parqueadero el gueardian   ");
            System.out.println("");
            System.out.println("1. Ingresar parqueadero");
            System.out.println("2. Salir del parqueadero");
            System.out.println("3. Consultar vehiculo ingresado");
            System.out.println("4. Salir");

            try {
                System.out.println("");
                System.out.println("Escribe una de las opciones");
                opcion = Integer.parseInt(bfr.readLine());

                switch (opcion) {
                    case 1:
                        System.out.println("");
                        System.out.println("Escribe el numero de placa");
                        placa = bfr.readLine();

                        System.out.println("Escribe la marca del vehiculo");
                        marca = bfr.readLine();

                        System.out.println("Escribe tu nombre");
                        nombreCliente = bfr.readLine();

                        System.out.println("Escribe numero de contacto");
                        numeroTelefono = bfr.readLine();

                        vehiculo = new Vehiculo(placa, marca, nombreCliente, numeroTelefono);

                        parqueadero.registrarehiculo(vehiculo);
                        if (parqueadero.evaluarCuposDisponibles()) {
                            System.out.println("Parqueadero se encuentra sin celdas disponibles ");
                            System.out.println("");
                        } else {
                            System.out.println("Aun hay celdas disponibles ");
                            System.out.println("");
                        }

                        break;
                    case 2:

                        System.out.println("");
                        parqueadero.salidaVehiculo();

                        break;
                    case 3:

                        System.out.println("");
                        System.out.println("Escribe el numero de la placa");
                        placa = bfr.readLine();

                        parqueadero.consultarVehiculoDentro(placa);

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
