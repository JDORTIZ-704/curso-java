package cursojava.estructurasbasicas.claude;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean condition = false;
        char c;
        int option;

        System.out.print("Input one character: ");
        c = sc.next().charAt(0);

        do {

            System.out.println("1 - Pyramid");
            System.out.println("2 - Diamond");
            System.out.print("Choose an option: ");
            option = sc.nextInt();
            if (option >= 1 && option <= 2) {
                condition = true;
            } else {
                System.out.println("Invalid option, please try again");
            }

        } while (!condition);

        switch (option) {
            case 1:
                System.out.println("Option 1 - Pyramid");
                for (int i = 1; i <= 4; i++) {
                    for (int s = 1; s <= 4 - i; s++) {
                        System.out.print(" ");
                    }
                    for (int z = 1; z <= 2 * i - 1; z++) {
                        System.out.print(c);
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Option 2 - Diamond");
                for (int i = 1; i <= 4; i++) {
                    for (int s = 1; s <= 4 - i; s++) {
                        System.out.print(" ");
                    }
                    for (int z = 1; z <= 2 * i - 1; z++) {
                        System.out.print(c);
                    }
                    System.out.println();
                }
                for (int i = 3; i >= 1; i--) {
                    for (int s = 4; s >= 1 + i; s--) {
                        System.out.print(" ");
                    }
                    for (int z = 1; z <= 2 * i - 1; z++) {
                        System.out.print(c);
                    }
                    System.out.println();
                }
                break;
        }

        sc.close();

    }

}

