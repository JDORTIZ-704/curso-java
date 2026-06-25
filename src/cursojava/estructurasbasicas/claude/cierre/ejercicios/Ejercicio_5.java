package cursojava.estructurasbasicas.claude.cierre.ejercicios;

import java.awt.event.ContainerAdapter;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] list = new double[5];

        double sum = 0;
        int contadorNotas = 0;
        boolean condicionNotas;

        do {
            for (int i = 0; i < list.length; i++) {
                System.out.print("Introduce la nota #" + (i + 1) + ": ");
                list[i] = sc.nextDouble();
            }

            condicionNotas = true;
            for (double arrayValidacion : list) {
                if (arrayValidacion < 0.0 || arrayValidacion > 5.0) {
                    System.out.println("Ingresa valores entre 0.0 y 5.0");
                    condicionNotas = false;
                }
            }

        } while (!condicionNotas);

        double max = list[0];
        double min = list[0];
        for (int e = 1; e < list.length; e++) {
            if (list[e] > max) {
                max = list[e];
            }
            if (list[e] < min) {
                min = list[e];
            }
        }

        for (double arrayList : list) {
            sum += arrayList;
            if (arrayList >= 3.0) {
                contadorNotas++;
            }
        }

        System.out.println("Cantidad notas >= 3.0: " + contadorNotas);
        System.out.println("Prom notas: %.2f%n" + (sum / list.length));
        System.out.println("Nota Max: " + max);
        System.out.println("Nota Min: " + min);

        sc.close();
    }
}
