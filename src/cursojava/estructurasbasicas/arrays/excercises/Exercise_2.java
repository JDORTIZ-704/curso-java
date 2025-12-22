package cursojava.estructurasbasicas.arrays.excercises;

import java.util.Scanner;

public class Exercise_2 {

    public static void main (String[] args) {

        // Ejercicio 2. Media en posiciones pares del Array.
        // En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola.
        // Los números se almacenarán en un array y el programa calculará la media de los números introducidos en las posiciones pares del array.
        // (Debes utilizar el operador módulo “%”).

        Scanner sc = new Scanner(System.in);

        int [] matriz = new int[10];

        int count=0;
        int count2=0;

        for (int i=0; i<matriz.length; i++) {
            matriz[i] = sc.nextInt();
            if (i % 2 == 0) {
                count += matriz[i];
                count2++;
            }
        }

        System.out.println("la media es: " + count/count2);

    }
}
