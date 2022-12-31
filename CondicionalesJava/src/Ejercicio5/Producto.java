package Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Producto {

    private String nombre;
    private int precio;
    private String caracteristicas;


    public Producto() {
    }

    public Producto(String nombre, int precio, String caracteristicas) {
        this.nombre = nombre;
        this.precio = precio;
        this.caracteristicas = caracteristicas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", caracteristicas='" + caracteristicas + '\'' +
                '}';
    }
}
