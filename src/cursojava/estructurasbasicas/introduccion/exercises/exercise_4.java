package cursojava.estructurasbasicas.introduccion.exercises;

import javax.swing.*;

public class exercise_4 {

    public static void main(String[] args){

        double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Base: "));

        double expo = Double.parseDouble(JOptionPane.showInputDialog(null, "Expo: "));

        System.out.print("Result of " + base + " and " + expo + " is " + Math.pow(base, expo));

    }
}
