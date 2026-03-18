package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {

        //Escribe un programa que ordene tres números enteros introducidos por teclado.

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int aux;

        System.out.print("Primer número: ");
        num1 = sc.nextInt();
        System.out.print("Segundo número: ");
        num2 = sc.nextInt();
        System.out.print("Tercer número: ");
        num3 = sc.nextInt();

        // num1: 9
        // num2: 5
        // num3: 1

        if (num1 > num2) { // num1: 5 - num2: 9
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if (num1 > num3) { // num1: 1 - num3: 5
            aux = num1; //aux: 5
            num1 = num3; // num1: 1
            num3 = aux; // num3: 5
        }
        if (num2 > num3) { // num2: 5 - num3: 9
            aux = num2; // aux: 9
            num2 = num3; // num2: 5
            num3 = aux; // num3: 9
        }

        System.out.print(num1 + " " + num2 + " " + num3);

        sc.close();

    }
}
