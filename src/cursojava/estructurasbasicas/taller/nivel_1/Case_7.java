package cursojava.estructurasbasicas.taller.nivel_1;

import javax.xml.stream.events.EntityReference;
import java.util.Scanner;

public class Case_7 {

    public static void main(String[] args) {

/*        4️⃣ Mostrar los primeros N números impares
        Entrada: 6
        Salida: 1 3 5 7 9 11
🔑 Clave:
•	Usar residuo % 2
•	Contador solo sube si es impar*/

        Scanner sc = new Scanner(System.in);

        int entrada;
        int numeroQuePruebo = 0;
        int contador = 0;

        System.out.print("Ingresa un número: ");

        entrada = sc.nextInt();

        while (contador < entrada) {
            if (numeroQuePruebo % 2 != 0) {
                System.out.println(numeroQuePruebo);
                contador++;
            }
            numeroQuePruebo++;
        }

        sc.close();
    }
}
