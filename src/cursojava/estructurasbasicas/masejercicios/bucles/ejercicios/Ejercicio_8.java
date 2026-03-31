package cursojava.estructurasbasicas.masejercicios.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {

        // Muestra la tabla de multiplicar de un número introducido por teclado.

        Scanner sc = new Scanner(System.in);

        int tabla;

        System.out.print("Ingresa la tabla a imprimir: ");
        tabla = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " * " + tabla + " = " + (i * tabla));
        }

        sc.close();

    }
}
