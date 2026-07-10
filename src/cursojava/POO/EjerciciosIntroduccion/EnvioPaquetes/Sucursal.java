package cursojava.POO.EjerciciosIntroduccion.EnvioPaquetes;

import java.util.Random;

public class Sucursal {

    private String direccion;
    private String ciudad;
    private int numeroSucursal;

    public Sucursal(int numeroSucursal, String ciudad, String direccion) {
        this.numeroSucursal = numeroSucursal;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public String getNumeroSucursal() {
        return "Número de sucursal: " + numeroSucursal;
    }

    public void setNumeroSucursal(int numeroSucursal) {
        if (numeroSucursal < 0) {
            System.out.println("Debe ingresar un número de sucursal valido.");
        } else {
            System.out.println("Número de sucursal creado correctamente.");
            this.numeroSucursal = numeroSucursal;
        }
    }

    public String getCiudad() {
        return "Ciudad: " + ciudad;
    }

    public void setCiudad(String ciudad) {
        System.out.println("Ciudad registrada correctamente.");
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        System.out.println("Dirección introducida correctamente.");
        this.direccion = direccion;
    }

    public void setCalcularPrecio() {

    }
}
