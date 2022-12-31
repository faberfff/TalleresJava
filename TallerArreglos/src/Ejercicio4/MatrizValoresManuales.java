package Ejercicio4;

public class MatrizValoresManuales {

    private String[][] valores = new String[4][5];
    public MatrizValoresManuales(){

    }

    public String[][] llenarMatriz() {


        valores[0][0] = "01";
        valores[0][1] = "02";
        valores[0][2] = "03";
        valores[0][3] = "04";
        valores[0][4] = "05";

        valores[1][0] = "06";
        valores[1][1] = "07";
        valores[1][2] = "08";
        valores[1][3] = "09";
        valores[1][4] = "10";

        valores[2][0] = "11";
        valores[2][1] = "12";
        valores[2][2] = "13";
        valores[2][3] = "14";
        valores[2][4] = "15";

        valores[3][0] = "16";
        valores[3][1] = "17";
        valores[3][2] = "18";
        valores[3][3] = "19";
        valores[3][4] = "20";

        return valores;
    }

    public void mostrarMatriz(String[][] valores) {

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(valores[i][j] + " ");
            }
            System.out.println("");
        }
    }


    public void invertirMatriz(String[][] valores) {
        int i = 0;
        int j = 0;
        for (int fila = 0; fila <= 3; fila++) {
            for (int columna = 4; columna >= 0; columna--) {
                if (fila % 2 != 0) {

                    valores[i][j] = valores[fila][columna];
                    System.out.print(valores[i][j] + " ");
                }
            }
            for (int columna = 0; columna <= 4; columna++) {
                if (fila % 2 == 0) {

                    valores[i][j] = valores[fila][columna];
                    System.out.print(valores[i][j] + " ");
                }
            }
            System.out.println("");
        }

    }

}
