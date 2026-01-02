package cursojava.estructurasbasicas.taller.nivel_1;

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

        System.out.print("Ingresa un número: ");
        entrada = sc.nextInt();

        for (int i = 0; i <= entrada; i += 3) {
            System.out.println(i);
        }

    }

}
