package cursojava.estructurasbasicas.claude.cierre.ejercicios;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean condicionMenu = false;
        int opcion;
        int numero;
        int suma = 0;
        int contar = 0;
        double numeroPreAleatorio;

        do {

            System.out.println("╔══════════════════════╗");
            System.out.println("║ MENÚ EJERCICIOS      ║");
            System.out.println("╠══════════════════════╣");
            System.out.println("║ 1. Tabla Multiplicar ║");
            System.out.println("║ 2. Sumar Números     ║");
            System.out.println("║ 3. Adivina Número    ║");
            System.out.println("║ 4. Salir             ║");
            System.out.println("╚══════════════════════╝");

            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un número: ");
                    numero = sc.nextInt();
                    sc.nextLine();

                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " * " + i + " = " + (numero * i));
                    }
                    break;
                case 2:
                    do {
                        System.out.print("Ingresa un número (Cierra el programa con 0): ");
                        numero = sc.nextInt();
                        sc.nextLine();
                        if (numero != 0) {
                            suma += numero;
                            contar++;
                        }
                    } while (numero != 0);

                    if (contar != 0) {
                        System.out.println("La suma de los número ingresados es: " + suma);
                        System.out.println("El promedio es: " + (suma / contar));
                    }
                    break;
                case 3:
                    boolean condicionRandom = false;
                    int random = 0;
                    do {
                        while (!(random >= 1 && random <= 10)) {
                            numeroPreAleatorio = Math.random() * 100;
                            random = (int) numeroPreAleatorio;
                        }

                        System.out.println("Adivina el número ");
                        numero = sc.nextInt();
                        sc.nextLine();
                        if (numero == random) {
                            System.out.println("Número correcto");
                            condicionRandom = true;
                        } else {
                            System.out.println("Número incorrecto");
                        }
                    } while (!condicionRandom);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    condicionMenu = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (!condicionMenu);

        sc.close();

    }
}
