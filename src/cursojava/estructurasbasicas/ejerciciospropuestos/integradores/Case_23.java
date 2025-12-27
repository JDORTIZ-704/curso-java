package cursojava.estructurasbasicas.ejerciciospropuestos.integradores;

import java.util.Scanner;

public class Case_23 {

    public static void main (String[] args) {

         // Caso #23 -> Pedir 10 números y mostrar:
         // •	El mayor
         // •	El menor

        int [] list = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i=0; i<list.length; i++) {
            System.out.print("Ingresa el numero #" + (i+1) + ": ");
            list[i] = sc.nextInt();
        }

        int min = list[0];
        int max = list[0];

        for (int z=1; z<list.length; z++) {
            if (list[z] > max) {
                max = list[z];
            }
            if (list[z] < min) {
                min = list[z];
            }
        }

        System.out.println("Mayor: " + max);
        System.out.println("Menor: " + min);

        sc.close();

    }
}
