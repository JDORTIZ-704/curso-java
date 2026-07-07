package cursojava.POO.CuentaBancaria;

import java.util.Scanner;

public class UsoCuenta {


    public static void main(String[] args) {

        String nombreCliente1;
        double saldoCuentaCliente1;
        double a;

        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta1 = new CuentaBancaria(1, "", 1L);

        System.out.print("Bienvenido, por favor asigne su nombre: ");
        nombreCliente1 = sc.nextLine();
        cuenta1.setNombreTitular(nombreCliente1);
        cuenta1.setNumeroCuenta();
        System.out.println("Bienvenido " + cuenta1.getNombreTitular() + " Su número de cuenta asignado es " + cuenta1.getNumeroCuenta());
        System.out.print("Por favor ingrese saldo a su cuenta: ");
        saldoCuentaCliente1 = sc.nextDouble();
        sc.nextLine();
        cuenta1.setSaldo(saldoCuentaCliente1);

        System.out.println("Sus datos son: ");
        cuenta1.imprimirDatos();

        CuentaBancaria cuenta2 = new CuentaBancaria(100, "Jose", 2456L);
        System.out.println("Datos de la cuenta #2");

        cuenta2.imprimirDatos();

        System.out.println("--Transferencias entre cuentas--");
        System.out.print(cuenta1.getNombreTitular() + " Cuanto dinero desea transferir?: ");
        a = sc.nextDouble();
        sc.nextLine();
        cuenta1.setSaldo(cuenta1.getSaldo()-a);
        cuenta2.transferenciaDinero(a);

        System.out.println("Cuenta de " + cuenta1.getNombreTitular());
        cuenta1.imprimirDatos();
        System.out.println("Cuenta de " + cuenta2.getNombreTitular());
        cuenta2.imprimirDatos();

        sc.close();

    }
}

