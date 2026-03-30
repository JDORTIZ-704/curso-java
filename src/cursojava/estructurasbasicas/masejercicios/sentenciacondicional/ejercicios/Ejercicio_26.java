package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int entradaNormal = 8;
        final int entradaMiercoles = 5;
        final int entradaJuevesPareja = 11; // Entrada para dos y parejas en general
        final double descuentoCineCampa = 0.10;

        int entradas;
        String diaSemana;
        String tarjetaCineCampa;

        int precioEntradaIndividual = 0;
        int totalDescuento = 0;
        int total;

        System.out.println("Venta de entradas CinaCampa");
        System.out.print("Número de entradas: ");
        entradas = sc.nextInt();
        sc.nextLine();
        System.out.print("Día de la semana: ");
        diaSemana = sc.nextLine();
        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        tarjetaCineCampa = sc.nextLine();

        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");

        /*
         * Miércoles - 5 euros por día del cine.
         * Jueves - Sí es pareja - 11 euros para los dos.
         * Resto de días normales, si y solo si no tienen la tarjeta CineCampa.
         *
         *  */

        // Precio individual dependiendo el día de la semana

        if (diaSemana.equals("miércoles")) {
            System.out.println("Entradas individuales:         " + entradas);
            precioEntradaIndividual = entradas * entradaMiercoles;
            System.out.println("Precio por entrada individual: " + entradaMiercoles + " €");
            System.out.println("Subtotal:                      " + precioEntradaIndividual + " €");
        } else if (diaSemana.equals("jueves")) {
            int parejas = entradas / 2;
            int individuales = entradas % 2;
            precioEntradaIndividual = parejas * entradaJuevesPareja + individuales * entradaNormal;

            System.out.println("Entradas individuales:         2");
            System.out.println("Precio por entrada pareja:     " + entradaJuevesPareja + " €");
            System.out.println("Entradas individuales:         " + individuales);
            System.out.println("Precio por entrada individual: " + entradaNormal + " €");
            System.out.println("Subtotal:                      " + precioEntradaIndividual + " €");

        } else {
            System.out.println("Entradas individuales:         " + entradas);
            precioEntradaIndividual = entradas * entradaNormal;
            System.out.println("Precio por entrada individual: " + entradaNormal + " €");
            System.out.println("Subtotal:                      " + precioEntradaIndividual + " €");
        }

        if (tarjetaCineCampa.equals("s")) {
            totalDescuento = (int) (precioEntradaIndividual * descuentoCineCampa);
            System.out.println("Descuento:                     " + totalDescuento + " €");
        } else if (tarjetaCineCampa.equals("n")) {
            System.out.println("Descuento:                     0.00 €");
        } else {
            System.out.println();
        }

        total = precioEntradaIndividual - totalDescuento;

        System.out.println("Total a pagar:                 " + total + " €");

        sc.close();

    }
}
