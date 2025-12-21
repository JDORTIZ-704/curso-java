package cursojava.estructurasbasicas.ejerciciospropuestos.dowhile;

import java.util.Scanner;

public class Case_13 {

    public static void main (String[] args) {

        // Caso #13 -> Simular un cajero que permite retirar dinero hasta que el saldo sea 0.

        Scanner sc = new Scanner(System.in);

        int saldoInicial = 2000;
        int saldoRetiro;

        do {

            System.out.println("Tu saldo actual: " + saldoInicial);
            System.out.print("¿Cuanto dinero quieres retirar?: ");

            saldoRetiro = sc.nextInt();

            if (saldoRetiro > saldoInicial) {
                System.out.println("No puedes retirar mas de lo que tienes en su cuenta");
            } else if (saldoRetiro < 0) {
                System.out.println("No puedes retirar valores negativos");
            } else if (saldoRetiro == 0) {
                System.out.println("No puedes retirar 0 pesos");
            } else {
                saldoInicial -= saldoRetiro;
            }

        } while(saldoInicial > 0);

        System.out.println("Restiraste todo tu dinero en esta ultima transacción, Tu saldo actual es: " + saldoInicial);

        sc.close();

    }
}
