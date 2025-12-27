package cursojava.estructurasbasicas.ejerciciospropuestos.integradores;

import java.util.Scanner;

public class Case_22 {

    public static void main (String[] args) {

       //   Caso #22 -> Leer números hasta que el usuario decida parar y mostrar:
       //     •	Total de números
       //     •	Suma
       //     •	Promedio

        System.out.println("Para terminar el programa, escribe (0)");

        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Ingresa un numero #" + (count+1) + ": ");
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;

            count++;
        }

        System.out.println("Total numeros: " + count);
        System.out.println("Suma: " + sum);
        System.out.println("Prom: " + (sum/count));

        sc.close();

    }
}
