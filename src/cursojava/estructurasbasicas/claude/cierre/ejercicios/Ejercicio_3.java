package cursojava.estructurasbasicas.claude.cierre.ejercicios;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edad;
        String genero;
        int caso = 0;

        System.out.print("Ingresa tu edad: ");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.print("¿Genero? - (Mascúlino o Femenino): ");
        genero = sc.nextLine();

        // edad

        if (edad < 18) {
            System.out.println("Eres menor de edad");
            caso = 1;
        } else if (edad <= 59) {
            System.out.println("Eres adulto común");
            caso = 2;
        } else {
            System.out.println("Eres adulto mayor");
            caso = 3;
        }

        // voto

        if (edad >= 18) {
            System.out.println("Puedes votar");
        } else {
            System.out.println("No puedes votar");
        }

        // Pensión

        if (genero.equals("Mascúlino") && edad >= 62) {
            System.out.println("Puedes jubilarte");
        } else if (genero.equals("Femenino") && edad >= 57) {
            System.out.println("Puedes jubilarte");
        } else {
            System.out.println("No puedes jubilarte aún");
        }

        switch (caso) {
            case 1 -> System.out.println("Eres menor de edad");
            case 2 -> System.out.println("Eres adulto común");
            case 3 -> System.out.println("Eres adulto mayor");
        }

        sc.close();

    }
}
