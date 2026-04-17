package cursojava.estructurasbasicas.masejercicios.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroIngresado;
        boolean esPrimo = true;

        System.out.print("Introduzca un número: ");
        numeroIngresado = sc.nextInt();
        sc.nextLine();

        if (numeroIngresado < 2) {
            esPrimo = false;
        }

        for (int i = 2; i < numeroIngresado; i++) {
            if (numeroIngresado % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println("El " + numeroIngresado + " es primo");
        } else {
            System.out.println("El " + numeroIngresado + " no es primo");
        }

        sc.close();
    }
}
