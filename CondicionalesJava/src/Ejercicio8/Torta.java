package Ejercicio8;

public class Torta {

    String nombre;
    String sabor;
    String decoracion;
    String cantidadPorcion;

    public Torta() {

    }

    public Torta(String nombre, String sabor, String decoracion, String cantidadPorcion) {
        this.nombre = nombre;
        this.sabor = sabor;
        this.decoracion = decoracion;
        this.cantidadPorcion = cantidadPorcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(String decoracion) {
        this.decoracion = decoracion;
    }

    public String getCantidadPorcion() {
        return cantidadPorcion;
    }

    public void setCantidadPorcion(String cantidadPorcion) {
        this.cantidadPorcion = cantidadPorcion;
    }

    @Override
    public String toString() {
        return "Torta{" +
                "nombre='" + nombre + '\'' +
                ", sabor='" + sabor + '\'' +
                ", decoracion='" + decoracion + '\'' +
                ", cantidadPorcion='" + cantidadPorcion + '\'' +
                '}';
    }
}
