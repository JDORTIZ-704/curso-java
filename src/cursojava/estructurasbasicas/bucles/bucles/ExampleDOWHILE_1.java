package cursojava.estructurasbasicas.bucles.bucles;

import javax.swing.*;

public class ExampleDOWHILE_1 {
    public static void main(String[] args){

        JOptionPane.showMessageDialog(null,
                "Este programa cuenta los caracteres de la frase introducida\n"
                        + "Para terminar, escribe (salir)");

        String text = "";

        do {
            text = JOptionPane.showInputDialog(null, "Introduce el texto");

            JOptionPane.showMessageDialog(null, "el texto introducido tiene: "
                    + text.length() + " caracteres");
        }while (!text.equals("salir"));

        System.out.print("saliste del programa");
    }
}
