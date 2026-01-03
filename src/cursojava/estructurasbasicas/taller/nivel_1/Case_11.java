package cursojava.estructurasbasicas.taller.nivel_1;

import java.util.Scanner;

public class Case_11 {
    public static void main(String[] args) {
//    🧩 Ejercicio 11 – Primeros N números con exactamente dos divisores
//
//📥 Entrada: 5
//            📤 Salida: 4 9 25 49 121

        Scanner sc = new Scanner(System.in);

        int entrada;
        int contar = 0;
        int numeroQuePruebo = 2;
        int divisor = 0;

        System.out.print("Ingresa un número: ");
        entrada = sc.nextInt();

        while (contar < entrada) {
            for (int i = 2; i < numeroQuePruebo; i++) {
                if (numeroQuePruebo % i == 0) {
                    divisor++;
                }
            }
            if (divisor == 1) {
                System.out.println(numeroQuePruebo);
                contar++;
            }
            numeroQuePruebo++;
        }

        sc.close();

    }
}