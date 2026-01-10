package cursojava.estructurasbasicas.taller;

import java.util.Scanner;

public class Case_9 {
    public static void main (String[] args) {

/*        7️⃣ Mostrar los primeros N números que NO son múltiplos de 3
        Entrada: 5
        Salida: 1 2 4 5 7
🔑 Clave:
•	Condición negativa
•	Contador solo sube si cumple*/

        Scanner sc = new Scanner(System.in);

        int entrada;
        int numeroQuePruebo = 1;
        int contador = 0;

        System.out.print("Ingresa un número: ");
        entrada = sc.nextInt();

        while (contador < entrada) {
            if (numeroQuePruebo % 3 != 0) {
                System.out.println(numeroQuePruebo);
                contador++;
            }
            numeroQuePruebo++;

        }

        sc.close();

    }
}
