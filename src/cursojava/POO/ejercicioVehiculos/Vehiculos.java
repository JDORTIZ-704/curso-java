package cursojava.POO.ejercicioVehiculos;

public class Vehiculos {

    private int ruedas;
    private String color;
    private int largo;
    private int ancho;
    private int peso;

    public Vehiculos(int ruedas, String color) { // Constructor

        this.ruedas = ruedas;
        largo = 2;
        ancho = 1;
        peso = 2;
        this.color = color;

    }

    public void setColor(String color) { // Metodo sett que establece valor de propiedad
        this.color = color;
    }

    public String getColor() { // Metodo gett que devuelve el valor de la propiedad
        return color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
}
