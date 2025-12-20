package curso.java.estructurasbasicas.bucles.excercises;

import javax.swing.*;

public class Exercise_4 {
    public static void main (String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Factorial de"));
        long facto=num;
        for (int i=num-1; i>0; i--) {
            facto = facto*i;
        }
        System.out.print(facto);
    }
}
