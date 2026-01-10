package cursojava.estructurasbasicas.taller;

import java.util.Scanner;

public class Case_10 {
    public static void main(String[] args) {

/*        8️⃣ Mostrar los primeros N números que tengan más de un divisor
        Entrada: 4
        Salida: 4 6 8 9
🔑 Clave:
•	Similar a primos, pero al revés
•	Contar divisores*/

        Scanner sc = new Scanner(System.in);

        int entrada;
        int contar = 0;
        int numeroQuePruebo = 2;
        int divisores = 0;


        System.out.print("Ingresa un número: ");
        entrada = sc.nextInt();

        while (contar < entrada) {
            for (int i = 2; i < numeroQuePruebo; i++) {
                if (numeroQuePruebo % i == 0) {
                    divisores++;
                }
            }
            if (divisores > 1) {
                System.out.println(numeroQuePruebo);
                contar++;
            }
            numeroQuePruebo++;
        }

        sc.close();

    }
}
