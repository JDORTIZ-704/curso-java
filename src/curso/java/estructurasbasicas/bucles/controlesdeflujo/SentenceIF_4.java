package curso.java.estructurasbasicas.bucles.controlesdeflujo;

import javax.swing.*;

public class SentenceIF_4 {
    public static void main(String[] args) {

        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Tu edad:"));

        if (age >= 18) {
            String carnet = JOptionPane.showInputDialog(null, "Tienes Carnet - si/no");
            if (carnet.equals("si")) {
                JOptionPane.showMessageDialog(null, "Puedes comprar el carro");
            } else {
                JOptionPane.showMessageDialog(null, "No puedes comprar el carro");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Eres menor de edad no puedes hacer nada");
        }

    }
}
