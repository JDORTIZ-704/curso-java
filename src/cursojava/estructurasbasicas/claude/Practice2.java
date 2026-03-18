package cursojava.estructurasbasicas.claude;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double grade1;
        double grade2;
        double grade3;
        double average;

        System.out.println("Enter your grades");

        System.out.print("Grade #1: ");
        grade1 = sc.nextDouble();
        System.out.print("Grade #2: ");
        grade2 = sc.nextDouble();
        System.out.print("Grade #3: ");
        grade3 = sc.nextDouble();

        average = (grade1 + grade2 + grade3) / 3;

        System.out.println("Your average is: " + Math.round(average * 100.0) / 100.0);

        sc.close();

    }
}
