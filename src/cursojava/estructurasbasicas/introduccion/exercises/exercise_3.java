package cursojava.estructurasbasicas.introduccion.exercises;

import javax.swing.*;

public class exercise_3 {

    public static void main (String[] args) {

        double base;
        double expo;
        double result;

        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Base: "));

        expo = Double.parseDouble(JOptionPane.showInputDialog(null, "Expo: "));

        result = Math.pow(base, expo);

        System.out.print("Result of " + base + " and " + expo + " is " + result);

    }
}
