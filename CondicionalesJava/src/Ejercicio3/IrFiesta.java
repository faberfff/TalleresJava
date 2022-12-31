package Ejercicio3;

import java.util.Scanner;

public class IrFiesta {

    Scanner lector = new Scanner(System.in);

    public void evaluarIngreso(){
        String nombre;
        String apellido;
        int edad;

        System.out.println("Digita tu nombre");
        nombre = lector.nextLine();
        System.out.println("Digita tu apellido");
        apellido = lector.nextLine();
        System.out.println("Digita tu edad");
        edad = lector.nextInt();

        if(edad >= 18){
            System.out.println("Hola " + nombre + " " + apellido +
                    " Usted es mayor de edad, por lo tanto puede entrar a la fiesta");
        }else {
            System.out.println("Hola " + nombre + " " + apellido +
                    " Usted es menor de edad, por lo tanto, no puede entrar a la fiesta," +
                    "por favor devúelvase a su casa");
        }
    }
}
