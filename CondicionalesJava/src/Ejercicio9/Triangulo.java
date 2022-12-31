package Ejercicio9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangulo extends Figura{

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    private double base;
    private double altura;

    public Triangulo() {

    }

    @Override
    public void calcularArea() throws IOException {
        double area;
        System.out.println("Ingresa la base del triangulo");
        base = Double.parseDouble(bfr.readLine());
        System.out.println("Ingresa la altura del triangulo");
        altura = Double.parseDouble(bfr.readLine());
        area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area );
    }
}
