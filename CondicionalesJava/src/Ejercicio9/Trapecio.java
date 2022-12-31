package Ejercicio9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trapecio extends Figura{

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    private double base;
    private double base1;
    private double altura;

    public Trapecio() {

    }

    @Override
    public void calcularArea() throws IOException {
        double area;
        System.out.println("Digita la la primera base deltrapecio");
        base = Double.parseDouble(bfr.readLine());
        System.out.println("Digita la segunda base del trapecio ");
        base1 = Double.parseDouble(bfr.readLine());
        System.out.println("Digita la altura del trapecio ");
        altura = Double.parseDouble(bfr.readLine());
        area = ((base + base1) * (altura)) / 2;
        System.out.println("El area del trapecio es " + area);

    }
}
