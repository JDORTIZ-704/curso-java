package cursojava.estructurasbasicas.ejerciciospropuestos.arrys;

import java.util.Scanner;

public class Case_P_5 {

    public static void main (String[] args) {

        // Ordenar un array de atras hacia adelante

        Scanner sc = new Scanner(System.in);

        int n, m, x;

        System.out.print("Ingresa Filas: ");
        n = sc.nextInt();
        System.out.print("Ingresa Columnas: ");
        m = sc.nextInt();

        int [][] list = new int[n][m];

        x = n*m;

        for (int i=0; i<list.length; i++) {
            for (int j=list[0].length-1; j>=0; j--) {
                list[i][j] = x;
                x--;
            }
        }

        for (int i=0; i<list.length; i++) {
            for (int j=0; j<list[0].length; j++) {
                System.out.print(list[i][j]+" ");
            }
            System.out.println();
        }

    }
}
