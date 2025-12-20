package curso.java.estructurasbasicas.bucles.excercises;

import javax.swing.*;
import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {

        boolean valida = false;

        do {
            String email = JOptionPane.showInputDialog(null, "Introduce un correo");

            int arroba = 0;
            boolean punto = false;
            for (int i=0; i<email.length(); i++){
                if (email.charAt(i) == '@'){
                    arroba++;
                }
                if (email.charAt(i) == '.'){
                    punto=true;
                }
            }
                if (arroba == 1 && punto == true && email.length()>=4) {
                    valida = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Correo incorrecto");
                }

        }while (valida == false);
System.out.print("Correo correctos");
    }
}
