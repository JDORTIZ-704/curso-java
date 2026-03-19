package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_18 {
    public static void main(String[] args) {

        // Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado. Se permiten números de hasta 5 cifras.

        Scanner sc = new Scanner(System.in);

        int number;
        String amount;
        boolean condition = false;

        do {

            System.out.print("Enter a 5-digit value: ");
            number = sc.nextInt();

            amount = Integer.toString(number);

            if (amount.length() <= 5) {
                condition = true;
            } else {
                System.out.println("Error, please enter a 5-digit number.");
            }

        } while (!condition);

        System.out.println("First number is: " + amount.charAt(0));

        sc.close();

    }
}
