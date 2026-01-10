package cursojava.estructurasbasicas.taller;

import java.util.Scanner;

public class Case_4 {
    public static void main(String[] args) {

/*
        🟡 NIVEL 2 – YA SE PARECE MUCHO A LOS PRIMOS
        4️⃣ Mostrar los primeros N números impares
        Entrada: 6
        Salida: 1 3 5 7 9 11
🔑 Clave:
•	Usar residuo % 2
•	Contador solo sube si es impar
*/

        Scanner sc = new Scanner(System.in);

        int entrada;
        int numeroQuePruebo = 0;
        int contador = 0;

        System.out.print("Ingresa un número: ");
        entrada = sc.nextInt();

        while (contador < entrada) { // Es la condición que define cuantos números se van a imprimir.
            if (numeroQuePruebo % 2 == 0) { // condición normal -- Debe tener el "númeroQuePruebo" el cual va a hacer el que evalúa e imprima.
                System.out.println(numeroQuePruebo); // Se imprime el "númeroQuePruebo", solo imprime el que cumplió la condición.
                contador++; // contador para que se evalúe cuantos números se imprimen.
            }
            numeroQuePruebo++; // el contador "númeroQuePruebo" que va a seguir sumando números para que imprima, se descartan de acuerdo a la condición.
        }


        sc.close();

    }
}
