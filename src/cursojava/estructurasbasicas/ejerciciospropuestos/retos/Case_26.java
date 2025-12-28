package cursojava.estructurasbasicas.ejerciciospropuestos.retos;

import java.util.Scanner;

public class Case_26 {
    public static void main (String[] args) {

        // Caso #26 -> Pedir un número y determinar si es perfecto.

       Scanner sc = new Scanner(System.in);

       int sum = 0;
       int n = sc.nextInt();

       for (int i=n; i>0; i--) {
           System.out.println(i);
           if (n % i == 0 && i != n) {
               sum += i;
           }
       }

       if (sum != n) {
           System.out.println("El numero no es primo");
       } else {
           System.out.println("Suma: " + sum);
       }

    }
}
