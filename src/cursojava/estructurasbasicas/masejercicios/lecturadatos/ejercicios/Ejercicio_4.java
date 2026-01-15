package cursojava.estructurasbasicas.masejercicios.lecturadatos.ejercicios;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

        /*Escribe un programa que sume, reste, multiplique y divida dos números
        introducidos por teclado.*/

        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Introduce el primer número: ");
        numero1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        numero2 = sc.nextInt();

        System.out.println(numero1 + " + " + numero2 + " -> " + (numero1 + numero2));
        System.out.println(numero1 + " - " + numero2 + " -> " + (numero1 - numero2));
        System.out.println(numero1 + " * " + numero2 + " -> " + (numero1 * numero2));
        System.out.println(numero1 + " / " + numero2 + " -> " + (numero1 / numero2));

        sc.close();

    }
}
