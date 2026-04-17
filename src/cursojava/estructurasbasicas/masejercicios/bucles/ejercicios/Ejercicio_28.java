package cursojava.estructurasbasicas.masejercicios.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroFactorial;
        int totalFactorial = 1;

        do {
            System.out.print("Por favor, introduzca un número entero: ");
            numeroFactorial = sc.nextInt();
            sc.nextLine();

            if (numeroFactorial < 0) {
                System.out.println("El factorial no está definido para números negativos.");
            }

        } while (numeroFactorial < 0);


        for (int i = 1; i <= numeroFactorial; i++) {
            totalFactorial *= i;
        }

        System.out.println(numeroFactorial + "! = " + totalFactorial);

        sc.close();

    }
}
