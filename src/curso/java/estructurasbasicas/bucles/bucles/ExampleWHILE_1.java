package curso.java.estructurasbasicas.bucles.bucles;

import javax.swing.*;

public class ExampleWHILE_1 {
    public static void main(String[] args) {

        String clave = "Juan";
        String access = "";

        while (!clave.equals(access)) {

            access = JOptionPane.showInputDialog(null, "Introduce la clave de acceso");

            if (!clave.equals(access)) {
                JOptionPane.showMessageDialog(null,"Clave incorrecta");
            }


        }

        JOptionPane.showMessageDialog(null, "Bienvenido");

    }
}
