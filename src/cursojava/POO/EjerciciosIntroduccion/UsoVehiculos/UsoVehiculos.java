package cursojava.POO.EjerciciosIntroduccion.UsoVehiculos;

public class UsoVehiculos {
    public static void main(String[] args) {

        Vehiculos carro = new Vehiculos(4, "");

        carro.setColor("rojo");
        System.out.println(carro.getColor());

        Vehiculos carro2 = new Vehiculos(4, "");

        carro2.setColor("amarillo");
        System.out.println(carro2.getColor());

        carro2.setExtra(true);
        System.out.println(carro2.getExtra());

        Vehiculos miMoto = new Vehiculos(2,1,0.3,200);

        miMoto.setColor("Gris");

        System.out.println(miMoto.getPeso());

        Vehiculos miCamion = new Vehiculos(6,3,1.5,3500);

        miCamion.setColor("Azul");

        miCamion.setExtra(true,true,true);

        System.out.println(miCamion.getExtra());





        //System.out.println(carro.getColor());

    }
}
