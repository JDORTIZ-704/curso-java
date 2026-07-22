package cursojava.POO.EjerciciosIntroduccion.UsoColegio;

public class Alumno {

    private static int idAlumno = 1;
    private final int identificacion;
    private Colegio nombreColegio;
    private String nombreAlumno;
    private double notaAlumno;

    public Alumno(Colegio nombreColegio, String nombreAlumno, double notaAlumno) {
        this.nombreColegio = nombreColegio;
        this.nombreAlumno = nombreAlumno;
        this.notaAlumno = notaAlumno;
        
        identificacion = idAlumno;
        idAlumno++;
    }
}
