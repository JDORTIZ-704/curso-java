package curso.java.estructurasbasicas.bucles.controlesdeflujo;

import javax.swing.*;

public class SentenceTERNARY_2 {
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu edad"));

        String mayor = (edad>18)?"mayor de edad":"Menor de edad";

        System.out.print(mayor);

    }
}
