package cursojava.estructurasbasicas.bucles.controlesdeflujo;

import javax.swing.*;

public class SentenceTERNARY_1 {

    public static void main(String[] args){

        double salary1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el salario"));
        double salary2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el 2 salario"));

        double salariomayor;

//        if(salary1>salary2) salariomayor = salary1;
//        else salariomayor = salary2;

        salariomayor = (salary1>salary2)?salary1:salary2;

        System.out.print("salario mayor: " + salariomayor);

    }
}
