package curso.java.estructurasbasicas.bucles.controlesdeflujo;

import javax.swing.*;

public class SentenceIF_1 {
    public static void main(String[] args) {

        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Input your age: "));

        if (age >= 18) {
            JOptionPane.showMessageDialog(null, "Tue eres mayor de edad");
        } else {
            JOptionPane.showMessageDialog(null, "Eres menor de edad");
        }

    }
}
