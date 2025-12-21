package cursojava.estructurasbasicas.ejerciciospropuestos.fors;

import java.util.Scanner;

public class Case_17 {

    public static void main(String[] args) {

        // Caso #17 -> Calcular el factorial de un número.

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int num = sc.nextInt();

        int factorial = 1 ;

        for (int i=1; i<=num; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + num + " es " + factorial);

        sc.close();

    }
}
