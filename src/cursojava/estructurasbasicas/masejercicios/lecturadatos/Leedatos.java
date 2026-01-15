package cursojava.estructurasbasicas.masejercicios.lecturadatos;

import java.util.Scanner;

public class Leedatos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre = "";
        int edad;

        System.out.print("Introduce nombre y edad separados por un espacio: ");
        nombre = sc.next();
        edad = sc.nextInt();

        System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años.");



    }
}
