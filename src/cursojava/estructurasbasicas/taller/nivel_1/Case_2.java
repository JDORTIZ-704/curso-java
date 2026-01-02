package cursojava.estructurasbasicas.taller.nivel_1;

import java.util.Scanner;

public class Case_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;                 // cuántos primos quiero
        int contador = 0;      // cuántos primos llevo
        int candidato = 2;     // número que voy probando

        // Pedir n correctamente
        do {
            System.out.print("Ingresa un número positivo mayor que 1: ");
            n = sc.nextInt();
        } while (n <= 1);

        // Mientras no tenga n primos
        while (contador < n) {

            boolean esPrimo = true;

            // Verificar si el candidato es primo
            for (int i = 2; i * i <= candidato; i++) {
                if (candidato % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            // Si es primo, lo muestro y aumento el contador
            if (esPrimo) {
                System.out.print(candidato + " ");
                contador++;
            }

            // Paso al siguiente número
            candidato++;
        }
    }
}
