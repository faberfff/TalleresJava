package Ejercicio6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Main6 {

    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        boolean salir = false;
        int opcion;

        Telefono agendaTelefonica = new Telefono(3);
        String nombre;
        String numeroTelefono;
        String organizacion;

        Contacto contact;

        while (!salir) {

            System.out.println("");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Salir");

            try {
                System.out.println("");
                System.out.println("Escribe una de las opciones");
                opcion = Integer.parseInt(bfr.readLine());

                switch (opcion) {
                    case 1:
                        System.out.println("");
                        System.out.println("Escribe un nombre");
                        nombre = bfr.readLine();

                        System.out.println("Escribe un telefono");
                        numeroTelefono = bfr.readLine();

                        System.out.println("Escribe la organizacion");
                        organizacion = bfr.readLine();

                        contact = new Contacto(nombre, numeroTelefono, organizacion);

                        agendaTelefonica.aniadirContacto(contact);
                        if (agendaTelefonica.evaluarAgenda()) {
                            System.out.println("La agenda esta llena no se puede almacenar mas contactos");
                            System.out.println("");
                        } else {
                            System.out.println("Aun puedes almacenar contactoss");
                            System.out.println("");
                        }

                        break;
                    case 2:

                        System.out.println("");
                        agendaTelefonica.listarContactos();

                        break;
                    case 3:

                        System.out.println("");
                        System.out.println("Escribe un nombre");
                        nombre = bfr.readLine();

                        agendaTelefonica.buscarContacto(nombre);

                        break;
                    case 4:
                        System.out.println("");
                      agendaTelefonica.eliminaContacto();

                        break;

                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                bfr.readLine();
            }

        }
    }
}
