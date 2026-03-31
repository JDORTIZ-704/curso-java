package cursojava.estructurasbasicas.masejercicios.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroIntroducido;
        System.out.print("Introduzca un número: ");
        numeroIntroducido = sc.nextInt();
        sc.nextLine();

        for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
            System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
        }

        sc.close();

    }
}
