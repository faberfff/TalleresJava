package Ejercicio3;

public class NumerosPrimos {

    public NumerosPrimos() {

    }

    public void mostrarPrimos() {




        for (int i = 0; i < 999; i++) {
            int numero = 1;
            int contador = 0;
            while (numero <= i) {
                if (i % numero == 0) {
                    contador = contador + 1;
                }else {
                    contador = contador;
                }
                numero++;
            }
            if (contador == 2){
                System.out.println(i);
            }

        }
    }
}
