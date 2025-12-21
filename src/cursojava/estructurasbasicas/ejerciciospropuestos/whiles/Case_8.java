package cursojava.estructurasbasicas.ejerciciospropuestos.whiles;

import java.util.Scanner;

public class Case_8 {

    public static void main (String[] args) {

        // Caso #8 -> Leer números hasta que el usuario ingrese 0 y mostrar la suma total.

        System.out.println("Caso #8 -> Leer números hasta que el usuario ingrese 0 y mostrar la suma total.");

        Scanner entrada = new Scanner(System.in);

        int numero;
        int suma = 0;

        while (true) {

            numero = entrada.nextInt();

            if (numero == 0) {
                break;
            }

            suma += numero;
        }

        System.out.println(suma);
        entrada.close();
    }
}
