package cursojava.estructurasbasicas.ejerciciospropuestos.arrys;

import java.util.Scanner;

public class Case_P_3 {

    public static void main (String[] args) {

        // Serie fibonacci

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int c, n;

        System.out.print("Limite: ");
        n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }

        sc.close();

    }
}
