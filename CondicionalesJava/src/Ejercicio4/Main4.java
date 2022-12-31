package Ejercicio4;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {


        Scanner lector = new Scanner(System.in);
        int opcion = 1;
        int peliculaAlquilada;
        String usuario = "";
        String notacion = "";

        VideoTienda videoTienda = new VideoTienda();

        do {
            System.out.println("");
            System.out.println("\tBienvenido a su Video Tienda El Porvenir \n");

            videoTienda.mostrarGenero();
            System.out.println("Digita una opcion");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    usuario = videoTienda.leerUsuario();
                    videoTienda.saludarUsuario(usuario);
                    System.out.println("");
                    videoTienda.mostrarPorGenero(videoTienda.animes);
                    peliculaAlquilada = videoTienda.getPelicula();

                    for (int i = 0; i <= 4; i++) {
                        if (i == peliculaAlquilada) {
                            videoTienda.animes[i] = "Pelicula no esta disponible";

                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    videoTienda.mostrarPorGenero(videoTienda.animes);
                    System.out.println("¿Desea registar alguna anotación? ");
                    videoTienda.registrarAnotacion(usuario, notacion);

                    break;

                case 2:
                    usuario = videoTienda.leerUsuario();
                    videoTienda.saludarUsuario(usuario);
                    System.out.println("");
                    videoTienda.mostrarPorGenero(videoTienda.accion);
                    peliculaAlquilada = videoTienda.getPelicula();


                    for (int i = 0; i <= 4; i++) {
                        if (i == peliculaAlquilada) {
                            videoTienda.accion[i] = "Pelicula no esta disponible";

                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    videoTienda.mostrarPorGenero(videoTienda.accion);
                    System.out.println("");
                    System.out.println("¿Desea registar alguna anotación? ");
                    videoTienda.registrarAnotacion(usuario, notacion);

                    break;
                case 3:
                    usuario = videoTienda.leerUsuario();
                    videoTienda.saludarUsuario(usuario);
                    System.out.println("");
                    videoTienda.mostrarPorGenero(videoTienda.terror);
                    peliculaAlquilada = videoTienda.getPelicula();


                    for (int i = 0; i <= 4; i++) {
                        if (i == peliculaAlquilada) {
                            videoTienda.terror[i] = "Pelicula no esta disponible";

                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    videoTienda.mostrarPorGenero(videoTienda.terror);
                    System.out.println("");
                    System.out.println("¿Desea registar alguna anotación? ");
                    videoTienda.registrarAnotacion(usuario, notacion);


                    break;
                case 4:
                    usuario = videoTienda.leerUsuario();
                    videoTienda.saludarUsuario(usuario);
                    System.out.println("");
                    videoTienda.mostrarPorGenero(videoTienda.aventura);
                    peliculaAlquilada = videoTienda.getPelicula();


                    for (int i = 0; i <= 4; i++) {
                        if (i == peliculaAlquilada) {
                            videoTienda.aventura[i] = "Pelicula no esta disponible";

                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    videoTienda.mostrarPorGenero(videoTienda.aventura);
                    System.out.println("");
                    System.out.println("¿Desea registar alguna anotación? ");
                    videoTienda.registrarAnotacion(usuario, notacion);

                    break;

                case 5:
                    System.out.println("Ingresa cero para salir, uno para continuar");
                    opcion = lector.nextInt();
                    System.out.println("Hasta pronto!!!");
            }

        } while (opcion != 0);

    }
}
