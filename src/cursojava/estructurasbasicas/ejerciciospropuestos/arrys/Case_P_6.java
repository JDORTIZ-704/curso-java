package cursojava.estructurasbasicas.ejerciciospropuestos.arrys;

import java.util.Scanner;

public class Case_P_6 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, m;
        boolean numCorrect = false;

        do{
            System.out.print("Ingresa fila: ");
            n = sc.nextInt();
            System.out.print("Ingresa Columna: ");
            m = sc.nextInt();

            if (n % 2 != 0 && m % 2 != 0) {
                numCorrect = true;
            } else {
                System.out.println("Ingresa dos valores impares");
            }
            System.out.print(" ");

        }while(!numCorrect);

        char [][] list = new char[n][m];

        int mitad = list[0].length / 2;

        for (int i=0; i<list.length; i++) {
            for (int j=0; j<list[0].length; j++) {
                if ((i+j) >= mitad && (j-i) <= mitad) {
                    list[i][j] = '*';
                } else {
                    list[i][j] = ' ';
                }
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }

    }
}
