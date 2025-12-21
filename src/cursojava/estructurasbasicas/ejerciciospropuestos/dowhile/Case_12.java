package cursojava.estructurasbasicas.ejerciciospropuestos.dowhile;

import java.util.Scanner;

public class Case_12 {

    public static void main (String[] args) {

        // Caso #12 -> Pedir un número mayor que 0; repetir mientras el número no cumpla.

        System.out.println("Caso #12 -> Pedir un número mayor que 0; repetir mientras el número no cumpla.");

        Scanner sc = new Scanner(System.in);

        int num;

        do {

            System.out.print("Introduce un numero mayor a cero: ");
            num = sc.nextInt();

        } while (num <= 0);

        System.out.println("El numero " + num + " es mayor que cero");

        sc.close();

    }
}
