package cursojava.estructurasbasicas.arrays.excercises;

import java.util.Scanner;

public class Exercise_1 {

    public static void main (String[] args) {

        //Ejercicio 1. Almacenar en Array:

        //En este ejercicio se pide al usuario que introduzca 10 números enteros por consola. Los números introducidos se almacenarán en un array.
        // El programa imprime en consola cuántos números negativos, positivos y valores 0 hay en el array.

        Scanner sc = new Scanner(System.in);

        int [] valores = new int[10];

        for (int i=0; i<valores.length; i++) {
            valores[i] = sc.nextInt();
        }

        for (int imprime:valores) {
            System.out.print(imprime+ " ");
        }

        sc.close();
    }
}
