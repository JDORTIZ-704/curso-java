package cursojava.estructurasbasicas.masejercicios.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int filasIngresadas;

        System.out.print("Ingresa el número de filas: ");
        filasIngresadas = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= filasIngresadas; i++) {      // Pinta la columna inicial
            for (int e = i; e < filasIngresadas; e++) {   // Da los espacios hacia la derecha
                System.out.print(" ");
            }
            for (int z = 1; z <= i; z++) {                // pinta los números
                System.out.print(z);
            }
            for (int x = i - 1; x >= 1; x--) {            // pinta los números decrementando
                System.out.print(x);
            }
            System.out.println();                         // Da el salto de línea por cada fila
        }

        sc.close();

    }
}
