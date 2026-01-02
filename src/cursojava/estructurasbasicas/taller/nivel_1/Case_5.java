package cursojava.estructurasbasicas.taller.nivel_1;

import java.util.Scanner;

public class Case_5 {

    public static void main(String[] args) {

/*        5️⃣ Mostrar los primeros N números divisibles por 5
        Entrada: 4
        Salida: 5 10 15 20
🔑 Clave:
•	Condición: residuo == 0
•	Contador controla el fin*/

        Scanner sc = new Scanner(System.in);

        int entrada;
        int numeroQuePruebo = 1;
        int contador = 0;

        System.out.print("Ingresa un número: ");
        entrada = sc.nextInt();

        while (contador < entrada) {
            if (numeroQuePruebo % 5 == 0) {
                System.out.println(numeroQuePruebo);
                contador++;
            }
            numeroQuePruebo++;

        }

        sc.close();

    }
}
