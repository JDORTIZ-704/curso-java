package cursojava.POO.UsoVehiculos;

public class Vehiculos {

    private int ruedas;
    private String color;
    private int largo;
    private int ancho;
    private int peso;

    public Vehiculos() {

        ruedas = 4;
        color = "Sin color";
        largo = 2;
        ancho = 1;
        peso = 2;

    }

    public void setColor () {
        color = "Azul";
    }

    public String getColor(){
        return color;
    }

    public void MostrarDatos() {
       System.out.println("Color Vehiculo: " + color);
    }

}
