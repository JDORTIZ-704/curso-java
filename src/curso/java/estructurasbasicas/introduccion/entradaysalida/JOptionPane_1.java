package curso.java.estructurasbasicas.introduccion.entradaysalida;

import javax.swing.*;

public class JOptionPane_1 {

    public static void main(String[] args){

        String name;
        int age;

        name = JOptionPane.showInputDialog(null, "Input your name please: ");

        age = Integer.parseInt(JOptionPane.showInputDialog(null, "Input your age: "));

        JOptionPane.showMessageDialog(null, "Welcome: " + name + " you are " + age + " years old");

    }
}
