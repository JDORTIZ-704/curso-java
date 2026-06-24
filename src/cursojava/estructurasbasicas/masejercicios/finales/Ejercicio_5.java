package cursojava.estructurasbasicas.masejercicios.finales;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabra;
        int cantidadPalabras;
        char letra;
        int contarVocales = 0;

        System.out.print("Ingresa una palabra: ");
        palabra = sc.nextLine();

        cantidadPalabras = palabra.length();

        for (int i = 0; i < palabra.length(); i++) {
            letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contarVocales++;
            }
        }

        //Cantidad Caracteres
        System.out.println("Cantidad de caracteres: " + cantidadPalabras);
        //Frase en Mayúsculas
        System.out.println("Mayúsculas: " + palabra.toUpperCase());
        //Frase en Minúsculas
        System.out.println("Minúsculas: " + palabra.toLowerCase());
        //Cantidad de vocales que contiene la frase
        System.out.println("Cantidad de vocales: " + contarVocales);

        sc.close();

    }
}
