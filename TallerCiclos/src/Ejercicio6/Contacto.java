package Ejercicio6;

public class Contacto {

    private String nombre;
    private String numeroTelefono;
    private String organizacion;

    public Contacto(){

    }

    public Contacto(String nombre, String numeroTelefono, String organizacion){
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.organizacion = organizacion;
    }

    public Contacto(String nombre) {
        this.nombre = nombre;
        this.numeroTelefono = "";
        this.organizacion = "";
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return this.numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getOrganizacion() {
        return this.organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public boolean equals(Contacto c){
        if(this.numeroTelefono.equalsIgnoreCase(c.getNumeroTelefono())){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", organizacion='" + organizacion + '\'' +
                '}';
    }
}
