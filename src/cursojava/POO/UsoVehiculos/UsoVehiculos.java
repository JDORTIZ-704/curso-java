package cursojava.POO.UsoVehiculos;

public class UsoVehiculos {
    public static void main(String[] args) {

        Vehiculos carro = new Vehiculos(4, "");

        carro.setColor("rojo");
        System.out.println(carro.getColor());

        Vehiculos carro2 = new Vehiculos(4, "");

        carro2.setColor("amarillo");
        System.out.println(carro2.getColor());

        Vehiculos moto1 = new Vehiculos(2, "");




        //System.out.println(carro.getColor());

    }
}
