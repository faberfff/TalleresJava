package Ejercicio7;

import Ejercicio6.Contacto;

public class Vehiculo {

    private String placa;
    private String marca;
    private String nombreCliente;
    private String numeroTelefonoCliente;

    public Vehiculo() {

    }

    public Vehiculo(String placa, String marca, String nombreCliente, String numeroTelefonoCliente ) {
        this.placa = placa;
        this.marca = marca;
        this.nombreCliente = nombreCliente;
        this.numeroTelefonoCliente = numeroTelefonoCliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroTelefonoCliente() {
        return numeroTelefonoCliente;
    }

    public void setNumeroTelefonoCliente(String numeroTelefonoCliente) {
        this.numeroTelefonoCliente = numeroTelefonoCliente;
    }

    public boolean equals(Vehiculo v){
        if(this.placa.equalsIgnoreCase(v.placa)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
