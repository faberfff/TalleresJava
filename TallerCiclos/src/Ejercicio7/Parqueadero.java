package Ejercicio7;

import Ejercicio6.Contacto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parqueadero {

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    private Vehiculo[] vehiculos;

    public Parqueadero(){
        this.vehiculos = new Vehiculo[5];
    }

    public Parqueadero(int tamanio) {
        this.vehiculos = new Vehiculo[tamanio];
    }

    public void registrarehiculo(Vehiculo vehiculo) {

        System.out.println("");

        if(existeVehiculo(vehiculo)) {
            System.out.println("El Vehiculo ya se encuentra registrado");
        }else if(evaluarCuposDisponibles()) {
            System.out.println("El parqueadero se encuentra sin celdas disponibles," +
                    " no es posible registrar mas vehiculos");
        }else{
            boolean existe = false;

            for(int i = 0; i < vehiculos.length && !existe; i++){
                if(vehiculos[i] == null){
                    vehiculos[i] = vehiculo;
                    existe = true;
                }
            }

            if(existe){
                System.out.println("Se registro el ingreso del vehiculo con exito");
            }else{
                System.out.println("Lo sentimos el vehiculo no puede ser ingresado ");
            }
        }

    }

    public boolean existeVehiculo(Vehiculo vehiculo) {
        for(int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i] != null && vehiculo.equals(vehiculos[i])){
                return true;
            }
        }
        return false;
    }

    public void consultarVehiculoDentro(String placa) {

        System.out.println("");

        boolean encontrado = false;

        for (int i = 0; i < vehiculos.length && !encontrado; i++) {
            if(vehiculos[i] != null && vehiculos[i].getPlaca().equalsIgnoreCase(placa)) {
                System.out.println(" El vehiculo con placas : " + vehiculos[i].getPlaca() +
                        " Se encuentra dentro del parqueadero");
                encontrado = true;
            }
        }
        if(!encontrado) {
            System.out.println(" El Vehiculo no se encuentra en nuestras instalaciones ");
        }
    }

    public boolean vehiculoIngresado(Vehiculo vehiculo) {
        boolean ingresado = false;
        for(int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i] != null && vehiculo.equals(vehiculos[i])){
                return true;
            }
        }
        return false;
    }

    public boolean evaluarCuposDisponibles(){

        System.out.println("");

        for(int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i] == null){
                return false;
            }
        }
        return true;
    }

    public void salidaVehiculo() throws IOException {

        System.out.println("");

        boolean encontrado = false;

        System.out.println("Digita la placa del vehiculo");
        String placa = bfr.readLine();
        for (int i = 0; i < vehiculos.length && !encontrado; i++) {
            if (vehiculos[i] != null && vehiculos[i].getPlaca().equalsIgnoreCase(placa)) {
                vehiculos[i] = null;
                encontrado = true;

            }
        }
        if(encontrado) {
            System.out.println("Registro de la salida del vehiculo exitosa!!!");
        }else{
            System.out.println("El vehiculo no se encuentra registrado");
        }

    }

}
