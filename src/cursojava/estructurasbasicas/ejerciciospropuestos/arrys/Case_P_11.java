package cursojava.estructurasbasicas.ejerciciospropuestos.arrys;

import java.util.Scanner;

public class Case_P_11 {
    public static void main(String[] args) {

        // Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares de la primera,
        // y a continuación los elementos impares.

        Scanner sc = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int numeros;
        int[] listado = new int[10];

        for (int i = 0; i < listado.length; i++) {
            System.out.print((i + 1) + ". ingresa el numero: ");
            numeros = sc.nextInt();
            listado[i] = numeros;

            if (listado[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        int[] arrayPares = new int[pares];
        int[] arrayImpares = new int[impares];

        int conteoPares = 0;
        int conteoImpares = 0;

        for (int z = 0; z < 10; z++) {
            if (listado[z] % 2 == 0) {
                arrayPares[conteoPares] = listado[z];
                conteoPares++;
            } else {
                arrayImpares[conteoImpares] = listado[z];
                conteoImpares++;
            }
        }


        for (int imprimePares : arrayPares) {
            System.out.print(imprimePares + " - ");
        }

        System.out.println();

        for (int imprimeImpares : arrayImpares) {
            System.out.print(imprimeImpares + " - ");
        }

    }
}
