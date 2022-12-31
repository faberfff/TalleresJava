package Ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String placa = "";
        String novedadU = "";
        String novedadU1 = "";
        String novedadU2 = "";
        String novedadT;
        String novedadUsuario;
        String novedadTecnico = "";
        String fechaIngreso = "";
        String fechaSalida = "";
        String marca = "";
        Boolean atencion;
        List<String> entradas = new ArrayList<String>();
        String entrada;
        int opcion = 1;
        int controlEntrada = 1;
        int motoSalida = 0;
        int cantidadRepuestos = 0;

        TallerMotocicletas tallerMoto = new TallerMotocicletas();

        tallerMoto.menuServicio();
        atencion = tallerMoto.registraCilindraje();


            do {
                System.out.println("");

                tallerMoto.menuInicio();
                System.out.println("Digita una opcion");
                opcion = lector.nextInt();

                switch (opcion) {
                    case 1:

                        placa = tallerMoto.optenerPlaca();
                        marca = tallerMoto.optenerMarca();
                        fechaIngreso = tallerMoto.optenerFechaIngreso();
                        novedadU = tallerMoto.optenerNovedadUsuario();
                        lector.nextLine();
                        entrada = tallerMoto.registrarEntrada(controlEntrada, placa, marca, fechaIngreso, novedadU);
                        controlEntrada ++;
                        entradas = tallerMoto.ingresarEntrada(entrada);
                        lector.nextLine();
                        System.out.println("");

                        break;

                    case 2:
                        tallerMoto.mostrarRegistros();
                        lector.nextLine();
                        tallerMoto.mostrarEntradas((ArrayList<String>) entradas);

                        break;

                    case 3:

                        placa = tallerMoto.optenerPlaca();
                        fechaSalida = tallerMoto.optenerFechaSalida();
                        tallerMoto.registrarSalida(placa, fechaSalida);
                        System.out.println("Los repuestos utilizados en el mantenimiento fueron : ");
                        cantidadRepuestos = tallerMoto.inventarioRepuestos();
                        novedadT = tallerMoto.optenerNovedad();
                        novedadTecnico = tallerMoto.novedadPorMecanico(novedadT);


                        System.out.println("Digita el numero de registro a salir");
                        motoSalida = lector.nextInt();
                        entradas.remove(motoSalida);


                        break;

                    case 4:
                        System.out.println("Para salir digita cero");
                        opcion = lector.nextInt();

                }
            } while (opcion != 0);

    }
}
