package Ejercicio9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangulo extends Figura{

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    double largo;
    double ancho;

    public Rectangulo() {

    }

    public Rectangulo(String nombre, double largo, double ancho) {
        super(nombre);
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return this.largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public void calcularArea() throws IOException {

        double area;
        System.out.println("Ingresa el largo");
        largo = Double.parseDouble(bfr.readLine());
        System.out.println("Ingresa el ancho");
        ancho = Double.parseDouble(bfr.readLine());
        area = (largo * ancho);
        System.out.println("El area del Rectangulo es: " + area);

    }
}
