package cursojava.estructurasbasicas.bucles.excercises;

import javax.swing.*;

public class Exercise_2 {
    public static void main(String[] args) {

//        double random = Math.round(Math.random()*100);
        int random = (int)(Math.random()*100);

        double entry = 0;

        int contador = 0;

        System.out.println(random);

        while (random != entry) {
            entry = Double.parseDouble(JOptionPane.showInputDialog(null, "Adivina el numero"));

            if (random < entry) {
                JOptionPane.showMessageDialog(null, "El " + entry + " Es mayor");
            } else if (random > entry) {
                JOptionPane.showMessageDialog(null, "El " + entry + " Es menor");
            }

            contador++;
        }

        System.out.print("Lo lograste en: " + contador);


    }
}
