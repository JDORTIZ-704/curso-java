package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {

        // Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.

        Scanner sc = new Scanner(System.in);

        int number;
        int value;

        System.out.print("Enter one number: ");
        number = sc.nextInt();

        value = number % 10;

        System.out.println("Last figure: " + value);

        sc.close();

    }
}
