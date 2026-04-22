package cursojava.POO;

public class vehiculos {

    public vehiculos() { //

        ruedas = 4;
        largo = 2;
        ancho = 1;
        peso = 2;
        color = "sin color";

    }

    public void setColor() { // Método Setter que devuelve el valor de propiedad
        color = "azul";
    }

    public String getColor() { // Método Getter que devuelve valor de propiedad
        return color;
    }

    private int ruedas;
    private String color;
    private int largo;
    private int ancho;
    private int peso;

}
