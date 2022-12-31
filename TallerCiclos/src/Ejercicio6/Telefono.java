package Ejercicio6;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Telefono {


    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    private Contacto[] contactos;

    public Telefono(){
        this.contactos = new Contacto[3];
    }

    public Telefono(int tamanio) {
        this.contactos = new Contacto[tamanio];
    }

    public void aniadirContacto(Contacto contac) {

        System.out.println("");

        if(existeContato(contac)) {
            System.out.println("El contacto ya existe");
        }else if(evaluarAgenda()) {
            System.out.println("La agenda esta llena, no es posible crear mas contactos");
        }else{
            boolean existe = false;

            for(int i = 0; i < contactos.length && !existe; i++){
                if(contactos[i] == null){
                    contactos[i] = contac;
                    existe = true;
                }
            }

            if(existe){
                System.out.println("Se ha añadido el contacto con exito");
            }else{
                System.out.println("Lo siento el contacto no se puede añadir");
            }
        }

    }

   public boolean existeContato(Contacto contac) {
        for(int i = 0; i < contactos.length; i++) {
            if(contactos[i] != null && contac.equals(contactos[i])){
                return true;
            }
        }
        return false;
   }

   public void listarContactos() {

       System.out.println("");

        boolean encontrado = false;
        for (int i = 0; i < contactos.length; i++) {
            if(contactos[i] != null) {
                System.out.println("Nombre del contacto " + contactos[i].getNombre() +
                        " Numero de contacto " + contactos[i].getNumeroTelefono() +
                        " Nombre de la organizacion " + contactos[i].getOrganizacion()) ;
                encontrado = true;
            }
        }

       if(!encontrado) {
           System.out.println("La agenda se encuentra vacia");
       }

   }

   public void buscarContacto(String nombre) {

       System.out.println("");

        boolean encontrado = false;

       for (int i = 0; i < contactos.length && !encontrado; i++) {
           if(contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(nombre)) {
               System.out.println("El numero de telefono es: " + contactos[i].getNumeroTelefono());
               encontrado = true;
           }
       }
       if(!encontrado) {
           System.out.println("El contacto no existe");
       }
   }

   public boolean evaluarAgenda(){

       System.out.println("");

        for(int i = 0; i < contactos.length; i++) {
            if(contactos[i] == null){
                return false;
            }
        }
        return true;
   }

   public void eliminaContacto() throws IOException {

       System.out.println("");

       boolean encontrado = false;

       System.out.println("Digita el nombre");
       String nombre = bfr.readLine();
       for (int i = 0; i < contactos.length && !encontrado; i++) {
           if (contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(nombre)) {
               contactos[i] = null;
               encontrado = true;

           }
       }
       if(encontrado) {
           System.out.println("Se ha eliminado el contacto");
       }else{
           System.out.println("No se pudo eliminar el contacto");
       }

   }

}
