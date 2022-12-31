package Ejercicio10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banco {

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

    Cuenta cuentas[] = {new Cuenta("Faber", 100000), new Cuenta("Diana", 200000),
            new Cuenta("Helena", 150000),new Cuenta("Samuel", 120000)};

    public void mostrarInicio(){
        System.out.println("       Bienvenido a su banco Fiel  ");
    }

    public void realizarIngreso() throws IOException {
        String titular;
        double valor = 0;
        double nuevoValor = 0;
        System.out.println("Digita el nombre del titular");
        titular = bfr.readLine();
        System.out.println("Digita la cantidad a ingresar");
        valor = Double.parseDouble(bfr.readLine());
        for (Cuenta cuenta: cuentas) {
            if(titular.equalsIgnoreCase(cuenta.getTitular()) && valor > 0 ) {

                nuevoValor = valor + cuenta.getCantidad();
                cuenta.setCantidad(nuevoValor);
            }
        }
    }

    public void retiro() throws IOException {

        String titular;
        double valor = 0;
        double nuevoValor = 0;
        System.out.println("Digita el nombre del titular");
        titular = bfr.readLine();
        System.out.println("Digita la cantidad a retirar");
        valor = Double.parseDouble(bfr.readLine());
        for (Cuenta cuenta: cuentas) {
            if(titular.equalsIgnoreCase(cuenta.getTitular()) && valor <= cuenta.getCantidad() ) {

                nuevoValor = cuenta.getCantidad() - valor;
                cuenta.setCantidad(nuevoValor);
            }
        }
    }

    public void consultarSaldo() throws IOException {

        String titular;
        System.out.println("Digita el nombre del titular");
        titular = bfr.readLine();

        for (Cuenta cuenta: cuentas) {
            if(titular.equalsIgnoreCase(cuenta.getTitular())) {

                System.out.println("Señor(a) " + cuenta.getTitular() + " " + "Su saldo es de: " + cuenta.getCantidad());
            }
        }

    }



    public void mostrarMenu() throws IOException {
        int opcion = 4;
        do {
            System.out.println("");
            System.out.println("    Banco Fiel ");
            System.out.println("");
            System.out.println("1. Realizar Ingresos ");
            System.out.println("2. Retiro ");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir ");
            System.out.print("Ingresa la opcion: ");
            opcion = Integer.parseInt(bfr.readLine());
            evaluarOpcion(opcion);

        }while (opcion != 4);
    }

    private void evaluarOpcion(int opcion)throws IOException {
        switch (opcion){

            case 1:{

                System.out.println("");
                realizarIngreso();

            }break;

            case 2:{

                System.out.println("");
                retiro();

            }break;

            case 3:{
                System.out.println("");
                consultarSaldo();

            }break;
        }

    }


}
