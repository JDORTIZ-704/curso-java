package curso.java.estructurasbasicas.introduccion.inicio;

public class Practice_7 {

    public static void main (String[] args) {

//        String name = "Hoy es un excelente día para hacer el Course of Java";
//
//        int ultimaLetra = name.length();
//
//        System.out.print("La ultima letra de la cadena " + name + " Es la letra " + name.charAt(ultimaLetra-1));

//        String phrase = "No hay nada mejor que levantarse un domingo para estudiar java";
//
//        String result = phrase.substring(1,3);
//
//        System.out.print(result);

        String palabra1 = "casa";
        String palabra2 = "Casa";

        boolean result = palabra1.equalsIgnoreCase(palabra2);

        System.out.println("resultado: " + result);


    }
}
