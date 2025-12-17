package curso.java.estructurasbasicas.bucles.excercises;

import javax.swing.*;

public class Exercise_1 {
    public static void main(String[] args ){

        String genero;
        int altura;
        int peso=0;

        altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Altura en CM"));
        genero = JOptionPane.showInputDialog(null, "Genero");

        if (genero.equals("mujer")) {

            peso = altura - 120;

        } else if (genero.equals("hombre")) {
            peso = altura - 110;

        }
        JOptionPane.showMessageDialog(null, "Tu peso ideal es: " + peso);
    }
}
