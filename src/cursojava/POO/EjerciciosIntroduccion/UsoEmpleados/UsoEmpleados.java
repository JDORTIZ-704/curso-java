package cursojava.POO.EjerciciosIntroduccion.UsoEmpleados;

public class UsoEmpleados {
    public static void main(String[] args) {

        Empleados empleado1 = new Empleados("Juan");

        Empleados empleado2 = new Empleados("Alberto");

        Empleados empleado3 = new Empleados("Maria");

        System.out.println(empleado1.getDatosEmpleado());

        empleado1.setSeccion("Recursos Humanos");

        System.out.println(empleado1.getDatosEmpleado());

        System.out.println(empleado2.getDatosEmpleado());

        System.out.println(empleado3.getDatosEmpleado());

        System.out.println(Empleados.getIdSiguiente());

    }
}

class Empleados {

    private static int idSiguiente = 1;
    private final int identificacion;
    private final String nombre;
    private String seccion;

    public Empleados(String nombre) {
        this.nombre = nombre;
        seccion = "Administración";
        identificacion = idSiguiente;
        idSiguiente++;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDatosEmpleado() {
        return "El empleado " + nombre + " Pertenece a la sección de " + seccion + " y tiene el n° " + identificacion;
    }

    public static String getIdSiguiente() {
        return "El ID siguiente es " + idSiguiente;
    }

}
