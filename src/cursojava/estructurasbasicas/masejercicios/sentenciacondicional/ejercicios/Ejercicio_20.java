package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_20 {

    public static void main(String[] args) {


        //Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa.
        //Se permiten números de hasta 5 cifras.

        Scanner sc = new Scanner(System.in);

        boolean condition = false;
        boolean comparison = true;
        String value;
        int number;

        do {

            System.out.print("Enter a 5-digit value: ");
            number = sc.nextInt();

            value = Integer.toString(number);

            if (value.length() <= 5) {
                condition = true;
            } else {
                System.out.println("Error, please enter a 5-digit number.");
            }

        } while (!condition);

        for (int i = 0; i < value.length() / 2; i++) {
            if (value.charAt(i) != value.charAt(value.length() - 1 - i)) {
                comparison = false;
                break;
            }
        }

        if (comparison) {
            System.out.print("Number " + number + " is capicúa.");
        } else {
            System.out.print("Number " + number + " is not capicúa.");
        }

        sc.close();

    }
}
