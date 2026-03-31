package cursojava.estructurasbasicas.masejercicios.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int contarDigitos = 0;

        System.out.print("Ingresa un número: ");
        numero = sc.nextInt();
        sc.nextLine();

        do {

            numero /= 10;
            contarDigitos++;

        } while (numero > 0);

        System.out.println("El número tiene " + contarDigitos + " cifras.");

        sc.close();

    }
}
