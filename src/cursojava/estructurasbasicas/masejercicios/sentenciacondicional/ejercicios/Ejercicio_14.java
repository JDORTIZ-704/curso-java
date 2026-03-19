package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {

        // Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Input one number: ");
        num = sc.nextInt();

        if (num % 2 == 0 && num % 5 == 0) {
            System.out.println("This number is even and divisible by 5");
        } else if (num % 2 == 0) {
            System.out.println("This number is even");
        } else if (num % 5 == 0) {
            System.out.println("This number is divisible by 5");
        } else {
            System.out.println("This number is neither even nor divisible by 5");
        }

        sc.close();

    }
}

