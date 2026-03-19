package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {

        // Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado.
        // El menú permite elegir si el vértice apunta arriba, abajo, izquierda o derecha.

        Scanner sc = new Scanner(System.in);

        boolean condition = false;
        char c;
        int option;

        System.out.print("Input one character: ");
        c = sc.next().charAt(0);

        do {

            System.out.println("1 - Up");
            System.out.println("2 - Down");
            System.out.println("3 - Left");
            System.out.println("4 - Right");
            System.out.print("Choose an option: ");
            option = sc.nextInt();
            if (option >= 1 && option <= 4) {
                condition = true;
            } else {
                System.out.println("Invalid option, please try again");
            }

        } while (!condition);

        switch (option) {
            case 1:
                System.out.println("Option 1 - Up");
                for (int i = 1; i <= 4; i++) {
                    for (int z = 1; z <= i; z++) {
                        System.out.print(c);
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Option 2 - Down");
                for (int i = 4; i >= 1; i--) {
                    for (int z = 1; z <= i; z++) {
                        System.out.print(c);
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Option 3 - Left");
                for (int i = 1; i <= 4; i++) {
                    for (int z = i; z >= 1; z--) {
                        System.out.print(c);
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Option 4 - Right");
                for (int i = 1; i <= 4; i++) {
                    for (int s = 1; s <= 4 - i; s++) {
                        System.out.print(" ");
                    }
                    for (int z = 1; z <= i; z++) {
                        System.out.print(c);
                    }
                    System.out.println();
                }
                break;
        }

        sc.close();

    }
}
