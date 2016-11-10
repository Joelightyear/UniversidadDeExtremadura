
package universidaddeextremadura;


public class Becario extends Alumno{
    
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Becario(String departamento, String nombre, int edad) {
        super(nombre, edad);
        this.departamento = departamento;
    }
    
}
