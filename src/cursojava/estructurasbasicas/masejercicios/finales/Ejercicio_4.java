package cursojava.estructurasbasicas.masejercicios.finales;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int adivinarNumero;
        int numeroFinal = 0;
        boolean condicion = false;

        while (!(numeroFinal >= 1 && numeroFinal <= 20)) {
            double numeroPreAleatorio = Math.random() * 100;
            numeroFinal = (int) numeroPreAleatorio;
        }

        System.out.println("Número: " + numeroFinal);

        do {

            System.out.print("Adivina el número: ");
            adivinarNumero = sc.nextInt();

            if (adivinarNumero < numeroFinal) {
                System.out.println("El número es más alto");
            } else if (adivinarNumero > numeroFinal) {
                System.out.println("El número es más bajo");
            } else {
                System.out.println("¡Correcto!");
                condicion = true;
            }

        } while (!condicion);

        sc.close();

    }
}
