package Ejercicio4;

import java.util.Scanner;

public class VideoTienda {
    Scanner lector = new Scanner(System.in);

    String nombrePelicula;
    int opcion;
    String novedades;
    String peli;

    String animes [] = {"1.Naruto", "2.Dragon ball z", "3.Los 7 pecados capitales", "4.Castlevania", "5.Titanes del pacifico"};
    String accion [] = {"1.Rapido y furiosos", "2.Vikings", "3.Asesino mortal", "4.Venganza brutal", "5.Ciudad brutal", "Ciudad perdida"};
    String terror [] = {"1.Dracula", "2.Destino final", "3.El aro", "4.Constantine", "5.Fear of The dark"};
    String aventura [] = {"1.Tontos y mas tontos", "2.Son como niños", "3.Una niñera en apuros", "4.Todo poderoso", "5.La montaña de hielo"};
    String peliculasDIsponibles [];



    public void mostrarPorGenero(String lista[]){

        for (int i = 0; i< lista.length; i++){
            System.out.println(lista[i]);
        }
    }

    public String optenerPeli() {

        String peli;
        peli = "";
        String lista[] = new String[5];
        int opcion = 0;
        for (int i = 1; i < 5; i++) {
            if (opcion == i) {
                peli = lista[i];
                System.out.println(peli);
            }

        }
        return peli;
    }


    public void mostrarGenero(){
        int opcion;
            System.out.println("1.Animes");
            System.out.println("2.Accion");
            System.out.println("3.Terror");
            System.out.println("4.Aventura");
            System.out.println("5.Salir");
    }

    public int  getPelicula(){

        int opcionPeli = 0;

        System.out.println("Ingresa el numero de la pelicula que deseas ver ");
        opcionPeli = lector.nextInt();

        return opcionPeli;

    }
    public String leerUsuario(){
        String nombreUsuario = "";
        System.out.println("Digita el nombre del usuario");
        nombreUsuario = lector.nextLine();
        System.out.println(nombreUsuario);


        return nombreUsuario ;
    }

    public void saludarUsuario(String nombre){
        System.out.println("Estimado " + nombre + " Bienvenido a su video tienda, disfruta de todos nuestros servicios");
    }


    //Metodo que registra alguna anotacion hecha por el cliente
    public void registrarAnotacion(String nombre, String nota){
        System.out.println("Yo " + nombre + " realizo la suiguiente observación con el fin de que el" +
                " servicio mejore " + nota);
    }

}

