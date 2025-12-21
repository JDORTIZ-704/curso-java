package cursojava.estructurasbasicas.ejerciciospropuestos.whiles;

import java.util.Scanner;

public class Case_10 {

    public static void main (String[] args) {

        // Caso #10 -> Contar cuántos números positivos ingresa el usuario antes de escribir -1.

        System.out.println("Caso #10 -> Contar cuántos números positivos ingresa el usuario antes de escribir -1.");

        Scanner sc = new Scanner(System.in);

        int numero;
        int count = 0;

        while (true) {

            numero = sc.nextInt();

            if (numero > 0) {
                count++;
            } else if (numero == -1) {
                break;
            }
        }

        System.out.print("Fueron " + count + " numeros");

        sc.close();

    }
}
