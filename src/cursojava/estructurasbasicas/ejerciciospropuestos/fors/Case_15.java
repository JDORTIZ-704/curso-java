package cursojava.estructurasbasicas.ejerciciospropuestos.fors;

import java.util.Scanner;

public class Case_15 {

    public static void main (String[] args) {

        // Caso #15 -> Calcular la suma de los primeros N números naturales.

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");

        int num = sc.nextInt();
        int sum=0;

        if (num < 0) {
            System.out.println("El numero no es natural");
        }

        for (int i=0; i<=num; i++) {
            System.out.println(" + " + i);
            sum += i;
        }

        System.out.println("la suma es: " + sum);

        sc.close();

    }
}
