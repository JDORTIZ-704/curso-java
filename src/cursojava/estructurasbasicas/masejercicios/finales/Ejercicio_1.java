package cursojava.estructurasbasicas.masejercicios.finales;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;
        int edad;

        System.out.print("¿Cual es tu nombre?: ");
        nombre = sc.nextLine();
        System.out.print("¿Cual es tu edad?: ");
        edad = sc.nextInt();
        sc.nextLine();

        if (edad < 12) {
            System.out.println(nombre + " Eres un Niño");
        } else if (edad < 18) {
            System.out.println(nombre + " Eres un Adolescente");
        } else if (edad <= 25) {
            System.out.println(nombre + " Eres un Posible estudiante universitario");
        } else if (edad > 60) {
            System.out.println(nombre + " Eres un Adulto mayor");
        } else {
            System.out.println(nombre + "Eres un Adulto");
        }

        sc.close();

    }
}
