package cursojava.estructurasbasicas.ejerciciospropuestos.condicionales;

import java.util.Scanner;

public class Case_3 {

    public static void main (String[] args) {

        // Case #3 -> Leer tres números y mostrar el mayor de ellos.

        System.out.println("Case #3 -> Read three numbers and display the largest of them.");

        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int var1 = input.nextInt();
        System.out.print("Input second number: ");
        int var2 = input.nextInt();
        System.out.print("Input third number: ");
        int var3 = input.nextInt();

        if (var1 > var2 && var1 > var3) {
            System.out.print("The number " + var1 + " is the oldest");
        } else if (var2 > var1 && var2 > var3) {
            System.out.print("The number " + var2 + " is the oldest");
        } else if (var3 > var1 && var3 > var2) {
            System.out.print("The number " + var3 + " is the oldest");
        } else if (var1 == var2 && var2 == var3) {
            System.out.print("They are the same");
        } else {
            System.out.println("The largest number is " + var3);
        }

        input.close();

    }
}
