package cursojava.estructurasbasicas.ejerciciospropuestos.condicionales;

import java.util.Scanner;

public class Case_1 {

    public static void main (String[] args) {

        //  Caso #1 -> Leer un número entero y determinar si es positivo, negativo o cero.

        Scanner input = new Scanner(System.in);

        System.out.print("Input one number: ");

        int num = input.nextInt();

        if (num < 0) {
            System.out.println("Num "  + num + " is negative");
        } else if (num > 0) {
            System.out.println("Num "  + num + " is positive");
        } else {
            System.out.println("Num "  + num + " is zero");
        }

        input.close();

    }
}
