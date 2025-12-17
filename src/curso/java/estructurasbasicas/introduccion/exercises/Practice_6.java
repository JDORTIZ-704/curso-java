package curso.java.estructurasbasicas.introduccion.exercises;

public class Practice_6 {
    public static void main (String[] args) {

//        Ejercicio #1
//        Crea una clase nueva con el nombre de “Raiz_cuadrada”. Declara dos variables de tipo entero con los nombres de “numero” y “resultado”.
//        Inicia la variable “numero” con el valor 9.
//        Almacena en la variable “resultado” la raíz cuadrada de “numero”.
//        Al ejecutar el programa, deberá salir en consola el mensaje “La raíz cuadrada de 9 es 3” concatenando la cadena de texto con las variables “numero” y “resultado”.

        int numero;
        int resultado;

        numero = 9;
        resultado = (int) Math.sqrt(9);

        System.out.println("La raíz cuadrada de " + numero + " es " + resultado);

//        Ejercicio #2
//        Crea una clase nueva con el nombre de “Calculo_Potencia”. Declara dos variables en la misma línea con los nombres de “base” y “exponente”.
//        En la siguiente línea de código inicia la variable “base” en 5. A continuación inicia la variable “exponente” en 12.
//        Crea una variable con el nombre de “resultado” donde se almacenará el cálculo de “base” elevado a “exponente”.
//        Al ejecutar el programa, deberá salir en consola el mensaje “5 elevado a 12 es igual a 244140625” concatenando la cadena de texto con las variables “base”, “exponente” y “resultado”.

        double base, exponente;
        double resultado1;

        base = 5;
        exponente = 12;

        resultado1 = Math.pow(base, exponente);

        System.out.println(base + " elevado a " + exponente + " es igual a " + resultado1);

//        Ejercicio #3
//        Crea una nueva clase con el nombre de “Redondeo_numerico”. Declara una variable con el nombre de “numero” y almacena en ella el valor 16.35.
//                Sin declarar ninguna variable más, al ejecutar el programa deberá salir en consola el mensaje “16.35 redondeado = 16”

        float numero1 = 16.35F;

        System.out.println(numero1 + " Redondeado = " + Math.round(numero1));



    }

}
