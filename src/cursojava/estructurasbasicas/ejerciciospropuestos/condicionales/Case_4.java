package cursojava.estructurasbasicas.ejerciciospropuestos.condicionales;

import java.util.Scanner;

public class Case_4 {

    public static void main (String[] args) {

        /*
        4.	Leer una calificación (0–100) y mostrar:
        o	A (90–100)
        o	B (80–89)
        o	C (70–79)
        o	D (60–69)
        o	F (<60)
        */

        System.out.println("Read a grade (0–100) and display the grade");

        Scanner input = new Scanner(System.in);

        System.out.print("Your score (0–100) : ");

        int score = input.nextInt();

        /*
        if (score >= 90 && score <= 100) {
            System.out.print("A (90–100)");
        } else if (score >= 80 && score <= 89) {
            System.out.print("B (80–89)");
        } else if (score >= 70 && score <= 79) {
            System.out.print("C (70–79)");
        } else if (score >= 60 && score <= 69) {
            System.out.print("D (60–69)");
        } else if (score >= 0 && score < 60) {
            System.out.print("F (<60)");
        } else {
            System.out.print("Score not accepted");
        }
        */

        // Other option - better

        if (score >= 90 && score <= 100) {
            System.out.print("A (90–100)");
        } else if (score >= 80) {
            System.out.print("B (80–89)");
        } else if (score >= 70) {
            System.out.print("C (70–79)");
        } else if (score >= 60) {
            System.out.print("D (60–69)");
        } else if (score >= 0) {
            System.out.print("F (<60)");
        } else {
            System.out.print("Score not accepted");
        }


        input.close();

    }
}
