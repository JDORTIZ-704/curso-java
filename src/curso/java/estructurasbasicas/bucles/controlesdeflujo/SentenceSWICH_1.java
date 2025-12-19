package curso.java.estructurasbasicas.bucles.controlesdeflujo;

import javax.swing.*;

public class SentenceSWICH_1 {

    public static void main(String[] args) {

        int hijos = Integer.parseInt(JOptionPane.showInputDialog(null, "# de hijos"));

        switch (hijos) {
            case 0:
                System.out.println("Sin hijos");
                break;
            case 1:
                System.out.println("un hijo");
                break;
            case 2:
                System.out.println("dos hijos");
                break;
            case 3:
                System.out.println("tres hijos");
                break;
            case 4:
                System.out.println("cuatro hijos");
                break;
            default:
                System.out.println("Muchos hijos");

        }

    }

}
