package cursojava.POO.EjerciciosIntroduccion.UsoVehiculos;

public class UsoVehiculos {
    public static void main(String[] args) {

        boolean climatizadorExtra = true;

        Vehiculos carro = new Vehiculos(4, "");

        carro.setColor("rojo");
        System.out.println(carro.getColor());

        Vehiculos carro2 = new Vehiculos(4, "");

        carro2.setColor("amarillo");
        System.out.println(carro2.getColor());

        carro2.setExtra(climatizadorExtra);
        System.out.println(carro2.getExtra());


        Vehiculos moto1 = new Vehiculos(2, "");




        //System.out.println(carro.getColor());

    }
}
