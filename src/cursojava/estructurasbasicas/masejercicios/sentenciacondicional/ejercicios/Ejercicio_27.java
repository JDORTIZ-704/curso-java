package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int tartaManzana = 18;
        final int tartaFresa = 16;
        final int chocolateNegro = 14;
        final int chocolateBlanco = 15;
        final double anadidoNata = 2.50;
        final double precioNombre = 2.75;

        String sabor;
        String tipoChocolate = "";
        String preguntaNata;
        String preguntaNombre;

        int subtotalTarta = 0;
        double nataAplicada = 0;
        double nombreAplicado = 0;
        double total;

        System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
        sabor = sc.nextLine();

        if (sabor.equals("chocolate")) {
            System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
            tipoChocolate = sc.nextLine();
        }

        System.out.print("¿Quiere nata? (si o no): ");
        preguntaNata = sc.nextLine();
        System.out.print("¿Quiere ponerle un precioNombre? (si o no): ");
        preguntaNombre = sc.nextLine();

        switch (sabor) {
            case "manzana" -> {
                subtotalTarta = tartaManzana;
                System.out.println("Tarta de " + sabor + ": " + tartaManzana);
            }
            case "fresa" -> {
                subtotalTarta = tartaFresa;
                System.out.println("Tarta de " + sabor + ": " + tartaFresa);
            }
            case "chocolate" -> {
                if (tipoChocolate.equals("negro")) {
                    subtotalTarta = chocolateNegro;
                    System.out.println("Tarta de " + sabor + " " + tipoChocolate + ": " + chocolateNegro);
                } else if (tipoChocolate.equals("blanco")) {
                    subtotalTarta = chocolateBlanco;
                    System.out.println("Tarta de " + sabor + " " + tipoChocolate + ": " + chocolateBlanco);
                }
            }
        }

        if (preguntaNata.equals("si")) {
            nataAplicada = anadidoNata;
            System.out.println("Con nata: " + anadidoNata);
        }

        if (preguntaNombre.equals("si")) {
            nombreAplicado = precioNombre;
            System.out.println("Con precioNombre: " + precioNombre);
        }

        total = subtotalTarta + nataAplicada + nombreAplicado;

        System.out.println("Total: " + total);

        sc.close();

    }
}
