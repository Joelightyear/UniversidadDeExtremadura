
package universidaddeextremadura;


public class Master extends Estudio{
    
    private String especialidad;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Master(String especialidad, int codigo, Facultad facultad) {
        super(codigo, facultad);
        this.especialidad = especialidad;
    }
    
}
