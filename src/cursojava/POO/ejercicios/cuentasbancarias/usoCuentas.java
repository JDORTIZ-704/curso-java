package cursojava.POO.ejercicios.cuentasbancarias;

import java.util.Scanner;

public class usoCuentas {
    public static void main(String[] args) {

        String nombreCliente;
        double saldoCliente;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del titular: ");
        nombreCliente = sc.nextLine();
        System.out.print("Ingresar saldo: ");
        saldoCliente = sc.nextDouble();
        sc.nextLine();

        Cuentas nuevaCuenta = new Cuentas(nombreCliente, saldoCliente);


        System.out.println("Datos ingresados: ");
        System.out.println("nombre: " + nuevaCuenta.getNombreTitular());
        System.out.println("saldo: " + nuevaCuenta.getSueldo());


    }
}
