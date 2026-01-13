package cursojava.estructurasbasicas.masejercicios.variables.ejercicios;

public class Ejercicio_6 {
    public static void main(String[] args) {

        /*Escribe un programa que calcule el total de una factura a partir de la base
        imponible (precio sin IVA). La base imponible estará almacenada en una
        variable.*/

        double iva = 1.19;
        double subtotalCanasta = 134.560;

        System.out.println("Subtotal: " + subtotalCanasta);
        System.out.printf("%-10s %5.2f", "Total con IVA: ", (subtotalCanasta*iva));

    }
}
