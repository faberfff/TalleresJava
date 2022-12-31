package Ejercicio8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main8 {

    public static void main(String[] args) throws IOException {

        int contadorTortaVendida;
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        Pastelero pastelero = new Pastelero();
        pastelero.mostrarMenu();
       /* contadorTortaVendida = pastelero.registrarPedido();
        pastelero.mostrarVentaDia(contadorTortaVendida);*/
    }
}
