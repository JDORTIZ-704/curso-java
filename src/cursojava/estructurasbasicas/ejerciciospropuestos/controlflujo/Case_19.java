package cursojava.estructurasbasicas.ejerciciospropuestos.controlflujo;

import java.util.List;
import java.util.Scanner;

public class Case_19 {

    public static void main (String[] args) {

        // Case #19 -> Leer números; si el número es negativo, ignóralo (continue).

//        Scanner sc = new Scanner(System.in);
//
//        int num;
//
//        while (true) {
//            System.out.print("Ingresa un digito: ");
//            num = sc.nextInt();
//            if (num < 0) {
//                continue;
//            }
//            if (num == 0){
//                break;
//            }
//
//        }
//
//        sc.close();

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuanto numeros quieres ingresar?: ");
        int num = sc.nextInt();

        int [] list = new int[num];

        for (int i=0; i<list.length; i++) {
            System.out.print("Ingresa un numero: ");
            list[i] = sc.nextInt();
        }

        for (int listNum: list) {
            if (listNum < 0 ) {
                continue;
            }
            System.out.print(listNum + " + ");
        }

    }
}
