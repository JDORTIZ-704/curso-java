package cursojava.estructurasbasicas.ejerciciospropuestos.retos;

import java.util.Scanner;

public class Case_27 {

    public static void main (String[] args) {

        // Caso #27 -> Mostrar los primeros N números de la serie Fibonacci.

        Scanner sc = new Scanner(System.in);

        int f = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;

        for (int i=0; i<f; i++) {
            System.out.print(a);
            c = a + b;
            a = b;
            b = c;

        }

    }

}
