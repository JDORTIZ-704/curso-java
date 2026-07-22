package cursojava.POO.EjerciciosIntroduccion.UsoColegio;

public class Colegio {

    private String Colegio;
    private Alumno arrayAlumnos[];
    private int posicionArray = 0;

    public Colegio(String Colegio, int cantidadAlumnos) {
        this.Colegio = Colegio;
        arrayAlumnos = new Alumno[cantidadAlumnos];
    }

    public void setColegio(String colegio) {
        this.Colegio = colegio;
    }

    public void setCrearAlumno(String nombreAlumno, double notaAlumno) {
        Alumno nuevoAlumno = new Alumno(this, nombreAlumno, notaAlumno);
        arrayAlumnos[posicionArray] = nuevoAlumno;
        posicionArray++;
    }

    public Alumno getAlumno(int consultarAlumno) {
        return arrayAlumnos[consultarAlumno];
    }

}
