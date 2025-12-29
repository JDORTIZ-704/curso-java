package cursojava.estructurasbasicas.ejerciciospropuestos.arrys;

import java.util.Scanner;

public class Case_P_9 {
    public static void main (String[] args) {

        // Insertar un número en un array creciente.

        Scanner sc = new Scanner(System.in);

        boolean creciente = true;
        int numeroEntrada;
        int sitioNumero = 0;
        int j = 0;


        int [] numero = new int [6];


        do {

            System.out.println("Digita 5 números de forma creciente");

            for (int i=0; i<5; i++) {
                System.out.print((i+1) + ". Ingresa el número: ");
                numero[i] = sc.nextInt();
            }

            for (int i=0; i<4; i++) {
                if (numero[i] < numero[i+1]) {
                    creciente = true;
                }
                if (numero[i] > numero[i+1]) {
                    creciente = false;
                    break;
                }
            }
            if (!creciente) {
                System.out.println("Ingresa de nuevo los números");
            }

        } while (!creciente);

        System.out.print("Ingresa un número: ");
        numeroEntrada = sc.nextInt();

        // Saber en qué posición va el número.
        while (numero[j] < numeroEntrada && j < 5) {
            sitioNumero++;
            j++;
        }

        // Transladar la posición del arreglo.
        for (int i=4; i>=sitioNumero; i--) {
            numero[i+1] = numero[i];
        }

        numero[sitioNumero] = numeroEntrada;

        System.out.println("vista arreglo: ");
        for (int array:numero) {
            System.out.println(array);
        }
    }


}
