package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_19 {

    public static void main(String[] args) {

        //Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo.
        // Se permiten números de hasta 5 dígitos.

        Scanner sc = new Scanner(System.in);

        int number;
        int digits;
        String amount;
        boolean condition = false;

        do {

            System.out.print("Enter a 5-digit value: ");
            number = sc.nextInt();

            amount = Integer.toString(number);
            digits = amount.length();

            if (digits <= 5 || (amount.charAt(0) == '-' && digits == 6)) {
                condition = true;
            } else {
                System.out.println("Error, please enter a 5-digit number.");
            }

        } while (!condition);

        if (amount.charAt(0) == '-') {
            System.out.println("Digits: " + (digits -1));
        } else {
            System.out.println("Digits: " + digits);
        }

        sc.close();

    }
}