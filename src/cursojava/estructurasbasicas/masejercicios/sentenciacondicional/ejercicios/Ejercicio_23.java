package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int GENERAL = 21;
        final int REDUCIDO = 10;
        final int SUPERREDUCIDO = 4;

        double baseImponible;
        String iva;
        String promocion;
        double finalIva;
        double finalPromocion;
        double total;
        double baseConIva;

        System.out.print("Introduzca la base imponible: ");
        baseImponible = sc.nextDouble();
        sc.nextLine();
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        iva = sc.nextLine();
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        promocion = sc.nextLine();

        finalIva = switch (iva) {
            case "general" -> baseImponible * ((double) GENERAL / 100);
            case "reducido" -> baseImponible * ((double) REDUCIDO / 100);
            case "superreducido" -> baseImponible * ((double) SUPERREDUCIDO / 100);
            default -> 0;
        };

        baseConIva = baseImponible + finalIva;

        finalPromocion = switch (promocion) {
            case "mitad" -> baseConIva / 2;
            case "meno5" -> 5.0;
            case "5porc" -> baseConIva * 0.05;
            default -> 0;
        };

        System.out.println("Final promoción: " + finalPromocion);

        total = baseConIva - finalPromocion;

        System.out.println("Vase imponible:        " + baseImponible);
        System.out.println("IVA (" + finalIva + "%):            " + finalIva);
        System.out.println("Precio con IVA:        " + baseConIva);
        System.out.println("Cód. promo. (" + promocion + "):  " + (-finalPromocion));
        System.out.println("TOTAL:                 " + total);

        sc.close();

    }
}
