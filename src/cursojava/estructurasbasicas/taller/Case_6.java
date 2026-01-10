package cursojava.estructurasbasicas.taller;

import java.util.Scanner;

public class Case_6 {
    public static void main(String[] args) {

/*        3️⃣ Mostrar los primeros N múltiplos de 3
        Entrada: 4
        Salida: 3 6 9 12
🔑 Clave:
•	No paras por el valor
•	Paras por la cantidad*/


        Scanner sc = new Scanner(System.in);

        int entrada;
        int numeroQuePruebo = 1;
        int contador = 0;

        System.out.print("Ingresa un número: ");
        entrada = sc.nextInt();

        while (contador < entrada) {
            if (numeroQuePruebo % 3 == 0) {
                System.out.println(numeroQuePruebo);
                contador++;
            }
            numeroQuePruebo++;
        }

    }

}
