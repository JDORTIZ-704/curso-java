package cursojava.estructurasbasicas.taller;

import java.util.Scanner;

public class Case_8 {
    public static void main (String[] args) {

/*
        6️⃣ Mostrar los primeros N números mayores que 10 y pares
        Entrada: 3
        Salida: 12 14 16
🔑 Clave:
•	Dos condiciones al tiempo
•	Contador manda
*/

        Scanner sc = new Scanner(System.in);

        int entrada;
        int contador = 0;
        int numeroQuePruebo = 1;

        System.out.print("Ingresa un número: ");
        entrada = sc.nextInt();

        while (contador < entrada) {
            if (numeroQuePruebo > 10 && numeroQuePruebo % 2 == 0) {
                System.out.println(numeroQuePruebo);
                contador++;
            }
            numeroQuePruebo++;
        }

        sc.close();

    }
}
