package cursojava.estructurasbasicas.masejercicios.finales;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] valores = new int[5];

        int contador = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Ingresa el valor #" + (i + 1) + ": ");
            valores[i] = sc.nextInt();
            contador += valores[i];
        }

        int mayor = valores[0];
        int menor = valores[0];

        for (int valore : valores) {
            if (valore > mayor) {
                mayor = valore;
            }
            if (valore < menor) {
                menor = valore;
            }
        }

        for (int imprime : valores) {
            System.out.print(imprime + " ");
        }

        System.out.println();

        System.out.println("Promedio: " + (contador / valores.length));
        System.out.println("Valor mayor: " + mayor);
        System.out.println("Valor menor: " + menor);

        sc.close();

    }
}
