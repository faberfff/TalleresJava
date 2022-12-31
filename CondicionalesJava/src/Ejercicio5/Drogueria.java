package Ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drogueria{

    private int cantidadProducto = 0;
    private String productoCompra;
    private int precio = 0;
    private Boolean vendido = false;

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

    Producto[] productos = {new Producto("Acetaminofen", 1000, "Dolores generales"),
            new Producto("Ibuprofeno", 1200, "Dolores especificos"),
            new Producto("Dolex", 1500, "Malestar gripal, dolores de cabeza"),
            new Producto("Advil", 1800, "Dolores de cabeza"),
            new Producto("Aspirina", 2000, "Malestar, fiebre y congestion nasal")};

    public void listaProductos(){
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i].getNombre());
        }
    }

    public void mostrarMenu() throws IOException {
        int opcion = 4;
        do {
            System.out.println("");
            System.out.println("Droguería mi Salud ");
            System.out.println("");
            System.out.println("1. Comprar Producto ");
            System.out.println("2. Consultar Precio ");
            System.out.println("3. Devolución producto");
            System.out.println("4. Salir ");
            System.out.print("Ingresa la opcion: ");
            opcion = Integer.parseInt(bfr.readLine());
            evaluarOpcion(opcion);

        }while (opcion != 4);
    }

    private void evaluarOpcion(int opcion)throws IOException {
        switch (opcion){

            case 1:{

                System.out.println("Digita el nombre del producto que deseas comprar");
                productoCompra = bfr.readLine();
                System.out.println("Digita la cantidad de productos a comprar");
                cantidadProducto = Integer.parseInt(bfr.readLine());
                for(int j = 0; j < productos.length; j++){
                    if(productoCompra.equalsIgnoreCase(productos[j].getNombre())){
                        precio = (productos[j].getPrecio() * cantidadProducto);
                        System.out.println("La venta del producto " + productos[j].getNombre() +
                                " El total a pagar es: " + precio);
                        vendido = true;
                    }
                }


            }break;

            case 2:{

                System.out.println("¿Cúal producto desea averiguar? :");
                productoCompra = bfr.readLine();
                for(int k = 0; k < productos.length; k++){
                    if(productoCompra.equalsIgnoreCase(productos[k].getNombre()))  {
                        System.out.println("El valor del producto es " + productos[k].getPrecio() + "$ la unidad");
                        System.out.println("");
                        System.out.println("Las características del producto " + productos[k].getCaracteristicas());
                    }
                }

            }break;
            case 3:{

                System.out.println("Ingresa el nombre del producto que desea devolver:");
                productoCompra = bfr.readLine();

                for(int l = 0; l < productos.length; l++){

                    if(productoCompra.equalsIgnoreCase(productos[l].getNombre()) && vendido == true){
                        System.out.println("El producto de la devolución es " + productos[l].getNombre() +
                                " para un Total en $ de " + precio +"$");
                        vendido = false;
                    }
                }
            }break;
        }

    }

}
