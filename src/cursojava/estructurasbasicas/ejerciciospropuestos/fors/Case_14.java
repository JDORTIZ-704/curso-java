package cursojava.estructurasbasicas.ejerciciospropuestos.fors;

import java.util.Scanner;

public class Case_14 {

    public static void main (String[] args) {

        // Case #14 -> Mostrar la tabla de multiplicar de un número dado.

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el numero de la tabla de multiplicar que quieres ver: ");
        int table = sc.nextInt();

        for (int i=0; i<=10; i++) {
            System.out.println(i + " x " + table + " = " + (i*table));
        }

        sc.close();

    }
}
