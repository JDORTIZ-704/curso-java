package cursojava.estructurasbasicas.ejerciciospropuestos.condicionales;

import java.util.Scanner;

public class Case_2 {

    public static void main (String[] args) {

        // Caso #2 -> Leer un número y determinar si es par o impar.

        Scanner input = new Scanner(System.in);

        System.out.println("Case #2 -> Read a number and determine if it is even or odd.");

        System.out.print("Input one number: ");

        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.print("Number " + number + " is even");
        } else {
            System.out.print("Number " + number + " is odd");
        }

        input.close();
    }
}
