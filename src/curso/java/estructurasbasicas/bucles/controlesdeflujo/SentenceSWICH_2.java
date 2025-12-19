package curso.java.estructurasbasicas.bucles.controlesdeflujo;

import java.util.Scanner;

public class SentenceSWICH_2 {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        String diaSemana = entrada.nextLine();

        String resultado = switch (diaSemana) {

//            case "lunes" -> "Laborable";
//            case "martes" -> "Laborable";
//            case "miercoles" -> "Laborable";
//            case "jueves" -> "Laborable";
//            case "viernes" -> "Laborable";
//            case "sabado" -> "no Laborable";
//            case "domingo" -> "no Laborable";

            case "lunes", "martes", "miercoles", "jueves", "viernes" -> {
                System.out.println("Procesando lo demas");
                yield "hola";}
            case "sabado", "domingo" -> "no Laborable";

//            default -> "no valido";
            default -> {
                System.out.println("Procesando lo demas");
                yield "Dia no laborable";
            }

        };

        System.out.println(resultado);

    }

}
