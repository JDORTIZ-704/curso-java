package cursojava.estructurasbasicas.claude.cierre.proyectofinal;

import java.util.Scanner;

public class proyectofinal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[2][3];

        String[] nombres = new String[2];

        int[] edad = new int[2];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingresa el nombre del estudiante #" + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
            System.out.print("Ingresa la edad del estudiante: ");
            edad[i] = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingresa la nota #" + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
                sc.nextLine();
            }
        }

        System.out.println("\n--- Resumen ---");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + ": ");
            System.out.print(edad[i] + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(notas[i][j] + "  ");
            }
            System.out.println();
        }


    }
}
