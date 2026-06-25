package cursojava.POO.ejercicioVehiculos;

public class usoVehiculos {
    public static void main(String[] args) {

        Vehiculos miCoche2 = new Vehiculos(4, "rojo");
        miCoche2.setColor("amarillo");

        System.out.println(miCoche2.getColor());


    }
}
