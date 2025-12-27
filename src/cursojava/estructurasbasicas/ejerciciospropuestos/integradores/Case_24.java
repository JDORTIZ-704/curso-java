package cursojava.estructurasbasicas.ejerciciospropuestos.integradores;

import java.util.Scanner;

public class Case_24 {

    public static void main (String[] args) {

        // Caso #24 -> Simular un login con máximo 3 intentos.

        Scanner sc = new Scanner(System.in);

        String email = "juan@gmail.com";
        int password = 123;
        int intentos = 0;
        int count = 3;

        String inputEmail;
        int inputPassword;

        while (intentos < 3) {
            System.out.println("Login - Intentos restantes: " + count);
            System.out.print("Ingresa el email: ");
            inputEmail = sc.nextLine();
            System.out.print("Ingresa el password: ");
            inputPassword = sc.nextInt();
            sc.nextLine();

            if (inputEmail.equals(email) && inputPassword == password) {
                System.out.println("Bienvenido");
                break;
            } else {
                count--;
                intentos++;
            }

            if (intentos == 3) {
                System.out.print("Cuenta bloqueada, superaste el numero de intentos");
            }
        }
        sc.close();
    }
}
