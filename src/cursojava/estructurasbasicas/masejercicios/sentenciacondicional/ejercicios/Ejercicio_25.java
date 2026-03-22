package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double ESCUDO = 2.50;
        final double ENVIO = 3.25;

        int altoBandera;
        int anchoBandera;
        double calculoBandera;
        String bordado;

        System.out.print("Introduzca la altura de la bandera en cm: ");
        altoBandera = sc.nextInt();
        sc.nextLine();
        System.out.print("Ahora introduzca la anchura: ");
        anchoBandera = sc.nextInt();
        sc.nextLine();
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        bordado = sc.nextLine();

        calculoBandera = (anchoBandera * altoBandera / 100.0);

        System.out.println("Gracias. Aquí tiene el desglose de su compra.");

        if (bordado.equals("s")) {
            System.out.println("Bandera de 150 cm2: " + calculoBandera + "€");
            System.out.println("Con escudo:    " + ESCUDO + "€");
            System.out.println("Gastos de envío:    " + ENVIO + "€");
            System.out.println("Total:    " + (calculoBandera + ESCUDO + ENVIO) + "€");
        } else {
            System.out.println("Bandera de 150 cm2: " + calculoBandera + "€");
            System.out.println("Con escudo:    0,00 €");
            System.out.println("Gastos de envío:    " + ENVIO + "€");
            System.out.println("Total:    " + (calculoBandera + ENVIO) + "€");
        }

        sc.close();

    }
}
