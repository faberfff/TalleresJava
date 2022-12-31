package Ejercicio9;

import java.io.IOException;

public abstract class Figura {

    protected String nombre;

    public Figura(){

    }
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    abstract public void calcularArea() throws IOException;
}
