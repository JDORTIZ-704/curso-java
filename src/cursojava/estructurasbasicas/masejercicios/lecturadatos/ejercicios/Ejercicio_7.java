package cursojava.estructurasbasicas.masejercicios.lecturadatos.ejercicios;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {

        /*Escribe un programa que calcule el total de una factura a partir de la base
        imponible.*/

        Scanner sc = new Scanner(System.in);

        double iva = 1.19;
        double total;
        double resultado;

        System.out.print("Porcentaje de impuesto -> " + iva);
        System.out.print("\n Ingresa el total comprado: ");
        total = sc.nextDouble();
        resultado = total * iva;

        System.out.print("El total de la compra es: " + resultado);

        sc.close();

    }
}
