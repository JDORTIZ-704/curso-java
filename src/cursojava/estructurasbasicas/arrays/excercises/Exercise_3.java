package cursojava.estructurasbasicas.arrays.excercises;

public class Exercise_3 {

    public static void main (String[] args) {

        // Ejercicio 3. Almacenar aleatarios en array:
        // En este ejercicio debes crear un array de 100 elementos que guarde en cada una de las
        // posiciones un nº aleatorio entre 1 y 100. El programa debe imprimir en consola todos los
        // valores almacenados en el array. Utiliza un bucle for-each para leer los valores almacenados.
        // (Debes utilizar el metodo random() de la clase Math).

        int [] matriz = new int[100];

        for (int i=1; i<matriz.length; i++) {
            matriz[i] = (int) (Math.random()*100)+1;
        }

        for (int imprime:matriz) {
            System.out.println(imprime + " ");
        }

    }
}
