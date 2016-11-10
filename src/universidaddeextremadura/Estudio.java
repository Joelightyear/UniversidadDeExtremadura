
package universidaddeextremadura;

import java.util.ArrayList;


public class Estudio {
    
    private int codigo;
    private Facultad facultad;
    static ArrayList <Alumno> alumnos = new ArrayList <>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public static ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public static void setAlumnos(ArrayList<Alumno> alumnos) {
        Estudio.alumnos = alumnos;
    }
    
    public void addAlumno (Alumno alumnos){
        this.addAlumno(alumnos);
    }

    public Estudio(int codigo, Facultad facultad) {
        this.codigo = codigo;
        this.facultad = facultad;
    }

    
   
    
    
}
