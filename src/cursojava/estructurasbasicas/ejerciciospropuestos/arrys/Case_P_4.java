package cursojava.estructurasbasicas.ejerciciospropuestos.arrys;

import java.util.Scanner;

public class Case_P_4 {
    public static void main (String[] args) {

        // Hacer una cruz

        Scanner sc = new Scanner(System.in);

        boolean numCorrect = false;

        int n, m;

        do {
            System.out.print("Ingresa cantidad de filas: ");
            n = sc.nextInt();
            System.out.print("Ingresa cantidad de columnas: ");
            m = sc.nextInt();

            if (n % 2 != 0 && m % 2 != 0) {
                numCorrect = true;
            } else {
                System.out.println("Ingresa dos valores impares");
            }
            System.out.print(" ");

        } while (!numCorrect);

        char [][] list = new char[n][m];

        int mitadFilas = list.length / 2;
        int mitadColumnas = list[0].length / 2;

        for (int i=0; i<list.length; i++) {
            for (int j=0; j<list[0].length; j++) {
                if (i == mitadFilas || j == mitadColumnas) {
                    list [i][j] = '*';
                } else {
                    list [i][j] = ' ';
                }
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }

    }
}
