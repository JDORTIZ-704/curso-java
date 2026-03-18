package cursojava.estructurasbasicas.claude;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double gradesSum = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Your input grade #" + i + ": ");
            gradesSum += sc.nextDouble();
        }

        double average = Math.round((gradesSum / 3) * 100.0) / 100.0;

        if (average >= 3.0) {
            System.out.println("Your average is: " + average + " Approved");
        } else {
            System.out.println("Your average is: " + average + " Failed");
        }

        sc.close();

    }
}
