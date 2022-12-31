package Ejercicio4;

public class Main4 {

    public static void main(String[] args) {

        MatrizValoresManuales matrizValoresManuales = new MatrizValoresManuales();
        String[][] valores = new String[4][5];
        valores = matrizValoresManuales.llenarMatriz();
        matrizValoresManuales.mostrarMatriz(valores);
        System.out.println("");
        matrizValoresManuales.invertirMatriz(valores);
    }
}
