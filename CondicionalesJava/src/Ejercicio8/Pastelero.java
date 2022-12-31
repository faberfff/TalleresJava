package Ejercicio8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pastelero {

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    Cliente clientes[];
    String pedido;
    Torta torta;
    int conteoVenta;
    int venta = 0;
    Torta tortasVendidas[];

    Torta tortas[] = {new Torta("Torta mousse", "Chocolate","Crema de chocolate","Para ocho personas"),
    new Torta("Torta de fresa", "Fresa", "Fresas con crema de vainilla", "Para seis personas"),
    new Torta("Nutella", "Queso crema", "Snippet galletas y nutella", "Para ocho personas"),
    new Torta("Hojaldre", "Fresas con almendra", "Hojaldre fresas y almendra", "Para dos personas"),
    new Torta("Banana", "Chocolate y platano", "Crema de leche fresas", "Para diez personas")};

   public void listarTortasDisponible(){
       for (Torta torta: tortas) {
           System.out.println(torta.getNombre());
       }
   }

    public int registrarPedido() throws IOException {
        String nombre;
        String nombreTorta;
        System.out.println("Digita tu nombre");
        nombre = bfr.readLine();
        System.out.println("Digita el nombre de la torta que deseas llevar ");
        nombreTorta = bfr.readLine();

        for (Torta torta: tortas) {
            if(nombreTorta.equalsIgnoreCase(torta.getNombre())){
                Torta tortasVendidas[] = {new Torta(torta.getNombre(), torta.getSabor(), torta.getDecoracion(), torta.getCantidadPorcion())};
                Cliente cliente[] = {new Cliente(nombre)};
                pedido = "El pedido lo realizo el señor(a) "
                        + nombre + " El nombre de la torta es " + torta.getNombre() + " " +
                        "con sabor a " + torta.getSabor();
                venta ++;
            }
        }

        System.out.println(pedido);
        return venta;
    }

    public void mostrarVentaDia(int v){
        System.out.println(v);

    }


    public void mostrarMenu() throws IOException {
        int opcion = 4;
        do {
            System.out.println("");
            System.out.println("    Pasteleria don Carlos ");
            System.out.println("");
            System.out.println("1. Tortas disponibles ");
            System.out.println("2. Pedidos ");
            System.out.println("3. Venta diaria");
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
                listarTortasDisponible();

            }break;

            case 2:{

                System.out.println("");
             conteoVenta = registrarPedido();

            }break;

            case 3:{
                System.out.println("");
                System.out.println("La cantida de tortas vendidas el dia de hoy = " + conteoVenta);

            }break;
        }

    }
}
