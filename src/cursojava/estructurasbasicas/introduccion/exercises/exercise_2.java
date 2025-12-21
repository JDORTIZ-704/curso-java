package cursojava.estructurasbasicas.introduccion.exercises;

import java.util.Scanner;

public class exercise_2 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please, input one number: ");

        int number = input.nextInt();

        System.out.print("The root of " + number + " is " + Math.sqrt(number));

    }
}
