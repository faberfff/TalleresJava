package Ejercicio8;

import Ejercicio7.Vehiculo;

public class Usuario {

    private String nombre;
    private String telefono;

    private int calificacion;


    public Usuario(String nombre) {

        this.nombre = nombre;
    }

    public Usuario(String nombre, String telefono ) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Usuario(String nombre, String telefono, int calificacion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCalificacion() {
        return this.calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }



    public boolean equals(Usuario u){
        if(this.nombre.equalsIgnoreCase(u.nombre)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }
}
