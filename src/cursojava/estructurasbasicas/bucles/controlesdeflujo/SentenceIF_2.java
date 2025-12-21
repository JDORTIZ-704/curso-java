package cursojava.estructurasbasicas.bucles.controlesdeflujo;

import javax.swing.*;

public class SentenceIF_2 {
    public static void main (String[] args){

        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu edad: "));

        if (age < 18) {
            JOptionPane.showMessageDialog(null, "Eres menor de edad");
        } else if (age <=40) {
            JOptionPane.showMessageDialog(null, "Eres un adulto joven");
        } else if (age <= 65) {
            JOptionPane.showMessageDialog(null, "Eres un adulto normal");
        } else {
            JOptionPane.showMessageDialog(null, "Eres un adulto mayor");
        }

    }
}
