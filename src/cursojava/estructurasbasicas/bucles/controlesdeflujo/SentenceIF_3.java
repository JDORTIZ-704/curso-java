package cursojava.estructurasbasicas.bucles.controlesdeflujo;

import javax.swing.*;

public class SentenceIF_3 {
    public static void main (String[] args){

        int distanciaColegio;
        double rentaFamiliar;
        byte hermanos;

        distanciaColegio = Integer.parseInt(JOptionPane.showInputDialog(
                null, "A cuantos kilometros vives del colegio"));

        rentaFamiliar = Double.parseDouble(JOptionPane.showInputDialog(
                null, "¿Cuanto gana tu famila al año?"));

        hermanos = Byte.parseByte(JOptionPane.showInputDialog(
                null, "¿Cuantos hermanos tienes?"));

        if (distanciaColegio > 10 || rentaFamiliar < 20000 || hermanos >= 2){
            JOptionPane.showMessageDialog(null, "Tienes beca");
        } else {
            JOptionPane.showMessageDialog(null, "No eres apto para beca");
        }

    }
}
