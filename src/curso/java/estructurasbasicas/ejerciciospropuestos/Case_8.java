package curso.java.estructurasbasicas.ejerciciospropuestos;

import java.util.Scanner;

public class Case_8 {

    public static void main (String[] args) {

        // Caso #8 -> Leer números hasta que el usuario ingrese 0 y mostrar la suma total.

        System.out.println("Caso #8 -> Leer números hasta que el usuario ingrese 0 y mostrar la suma total.");

        Scanner entrada = new Scanner(System.in);

        int numero = 1;

        while (numero == 0) {
            int numero2 = entrada.nextInt();
            numero = numero + numero2;
        }

        entrada.close();

    }
}
