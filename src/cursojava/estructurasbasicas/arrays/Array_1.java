package cursojava.estructurasbasicas.arrays;

public class Array_1 {

    public static void main (String[] args) {

        /*
        int [] valores = new int[5];

        valores [0] = 15;
        valores [1] = 16;
        valores [2] = 17;
        valores [3] = 18;
        valores [4] = -19;
        */

//        int [] valores = {11,21,31,41,51,61,65,65,43,32,21,54,7666};

/*
        for (int i=0; i<valores.length; i++) {
            System.out.println(valores[i]);
        }
*/
        String [] nombrePersonas = {"hola","juan","maria","laura"};

//        for (int elemento: valores) {
//            System.out.println(elemento);
//        }
//        for (int i=0; i<nombrePersonas.length; i++) {
//            System.out.println(nombrePersonas[i]);
//        }

        for (String elemento: nombrePersonas) {
            System.out.println(elemento);
        }

    }
}
