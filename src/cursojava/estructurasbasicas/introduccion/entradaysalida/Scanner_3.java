package cursojava.estructurasbasicas.introduccion.entradaysalida;

import java.util.Scanner;

public class Scanner_3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Input your name: ");

        String name = input.nextLine();

        System.out.print("Input your age: ");

        int age = input.nextInt();

        System.out.print("You are " + name + " and you have " + age + " years old");

        input.close();

    }
}
