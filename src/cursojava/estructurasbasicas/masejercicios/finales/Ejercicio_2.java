package cursojava.estructurasbasicas.masejercicios.finales;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tabla;
        int contador = 0;

        System.out.print("Ingresa la tabla de multiplicar: ");
        tabla = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i <= 10; i++) {
            System.out.println(tabla + " * " + i + " = " + (tabla * i));
            contador += tabla * i;
        }

        System.out.println("Suma total: " + contador);

        sc.close();

    }
}
