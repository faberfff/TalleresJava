package Ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrizTablas {

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    private int[][] matriz = new int[10][10];

    public MatrizTablas(){

    }

    public void mostrarDatos() {
        System.out.println("---------------------------------------------------------------   ");
        System.out.println("   |              COLUMNAS                                        ");
        System.out.println("   |      0     1     2     3     4     5     6     7     8     9 ");
        System.out.println("---------------------------------------------------------------   ");
        System.out.println("   | 0 | 1x1   2x1   3x1   4x1   5x1   6x1   7x1   8x1   9x1  10x1");
        System.out.println("   | 1 | 1x2   2x2   3x2   4x2   5x2   6x2   7x2   8x2   9x2  10x2");
        System.out.println("   | 2 | 1x3   2x3   3x3   4x3   5x3   6x3   7x3   8x3   9x3  10x3");
        System.out.println(" F | 3 | 1x4   2x4   3x4   4x4   5x4   6x4   7x4   8x4   9x4  10x4");
        System.out.println(" I | 4 | 1x5   2x5   3x5   4x5   5x5   6x5   7x5   8x5   9x5  10x5");
        System.out.println(" L | 5 | 1x6   2x6   3x6   4x6   5x6   6x6   7x6   8x6   9x6  10x6");
        System.out.println(" A | 6 | 1x7   2x7   3x7   4x7   5x7   6x7   7x7   8x7   9x7  10x7");
        System.out.println(" S | 7 | 1x8   2x8   3x8   4x8   5x8   6x8   7x8   8x8   9x8  10x8");
        System.out.println("   | 8 | 1x9   2x9   3x9   4x9   5x9   6x9   7x9   8x9   9x9  10x9");
        System.out.println("   | 9 | 1x10  2x10  3x10  4x10  5x10  6x10  7x10  8x10  9x10 10x10");
    }

    public void operacion() throws IOException {

        int resultado = 0;
        int numeroFila;
        int numeroColumna;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++){
                matriz[i][j] = ((i + 1) * (j + 1));
            }
        }

        System.out.println("Ingresa el numero de la fila que desea conocer el resultado ");
        numeroFila = Integer.parseInt(bfr.readLine());
        System.out.println("Ingresa el numero de la columna que desea conocer el resultado ");
        numeroColumna = Integer.parseInt(bfr.readLine());

        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                if (matriz[fila][columna] == matriz[numeroFila][numeroColumna]){
                    resultado = matriz[fila][columna];
                }
            }
        }

        System.out.println("el resultado de la multiplicacion indicada es "  + resultado);
    }
}
