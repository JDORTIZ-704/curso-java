package cursojava.estructurasbasicas.ejerciciospropuestos.controlflujo;

import java.util.Scanner;

public class Case_20 {

    public static void main (String[] args) {

       // Caso #20 -> Detener el programa cuando el usuario ingrese el número 999.

        Scanner sc = new Scanner(System.in);

        int num;

        while (true) {
            System.out.print("Ingresa un número: ");
            num = sc.nextInt();

            if (num == 999){
                System.out.println("Saliste del programa");
                break;
            }

        }
        sc.close();
    }

}
