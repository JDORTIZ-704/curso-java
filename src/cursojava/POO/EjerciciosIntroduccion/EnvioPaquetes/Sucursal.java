package cursojava.POO.EjerciciosIntroduccion.EnvioPaquetes;

public class Sucursal {

    private String direccion;
    private String ciudad;
    private int numeroSucursal;

    public Sucursal(int numeroSucursal, String ciudad, String direccion) {
        this.numeroSucursal = numeroSucursal;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public void setNumeroSucursal(int numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double setCalcularPrecio(Paquete p) {

        double precioPaquete;

        precioPaquete = p.getPeso() * 2;

        if (p.getPeso() == 1) {
            precioPaquete += 10;
        }
        if (p.getPeso() == 2) {
            precioPaquete += 20;
        }

        return precioPaquete;
    }
}
