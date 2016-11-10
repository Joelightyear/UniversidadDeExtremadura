
package universidaddeextremadura;


public class Grado extends Estudio{
    
    private String duracion;

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Grado(String duracion, int codigo, Facultad facultad) {
        super(codigo, facultad);
        this.duracion = duracion;
    }
    
    
}
