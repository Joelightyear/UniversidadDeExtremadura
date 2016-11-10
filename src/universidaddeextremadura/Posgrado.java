
package universidaddeextremadura;


public class Posgrado extends Master{
    
    private String estudios_previos;

    public String getEstudios_previos() {
        return estudios_previos;
    }

    public void setEstudios_previos(String estudios_previos) {
        this.estudios_previos = estudios_previos;
    }

    public Posgrado(String estudios_previos, String especialidad, int codigo, Facultad facultad) {
        super(especialidad, codigo, facultad);
        this.estudios_previos = estudios_previos;
    }
    
    
}
