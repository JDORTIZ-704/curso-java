package cursojava.estructurasbasicas.claude.cierre.ejercicios;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String nombreUsuario;

        System.out.print("Ingresa tu nombre: ");
        nombreUsuario = sc.nextLine();

        //longitud del nombre
        System.out.println("El nombre tiene: " + nombreUsuario.length());
        //Nombre en Mayúsculas
        System.out.println("Mayúsculas: " + nombreUsuario.toUpperCase());
        //Nombre en Minúsculas
        System.out.println("Minúsculas: " + nombreUsuario.toLowerCase());
        //Letra A
        System.out.println("Letra (a) ¿Está?: " + nombreUsuario.toLowerCase().contains("a"));
        //Raíz Cuadrada
        System.out.println("Raíz de: %.2f%n" + Math.round(Math.sqrt(nombreUsuario.length())));

        sc.close();

    }
}


