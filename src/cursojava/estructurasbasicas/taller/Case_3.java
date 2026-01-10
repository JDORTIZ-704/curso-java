package cursojava.estructurasbasicas.taller;

import java.util.Scanner;

public class Case_3 {

    public static void main(String[] args) {

/*        1️⃣ Mostrar los primeros N números naturales
        Entrada: 5
        Salida: 1 2 3 4 5

🔑 Clave:

        No hay validaciones
        Solo un contador
        Parar cuando llegues a N */

        Scanner sc = new Scanner(System.in);

        int entrada;

        System.out.print("Ingresa un número: ");
        entrada = sc.nextInt();

        for (int i = 1; i <= entrada; i++) {
            System.out.println(i);

        }
    }

}
