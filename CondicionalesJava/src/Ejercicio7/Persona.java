package Ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Persona {

    String nombre;
    Float peso;
    Float estatura;
    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

    public Persona(){

    }

    public void calcularImc()throws IOException{

        Float bmi;

        System.out.println("Digita su nombre");
        nombre = bfr.readLine();

        System.out.println("Digita el peso");
        peso = Float.parseFloat(bfr.readLine());

        System.out.println("Digita la estatura");
        estatura = Float.parseFloat(bfr.readLine());

        bmi = (peso /(estatura * estatura));

        if(bmi < 18.5){
            System.out.println("Senor(a) " + nombre + " Usted se encuentra bajo de peso");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Senor(a) " + nombre + " Su peso es normal");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Senor(a) " + nombre + " Usted se encuentra en sobrepeso");
        } else if (bmi >= 30) {
            System.out.println("Senor(a) " + nombre + " Usted se encuentra obeso");

        }

    }
}
