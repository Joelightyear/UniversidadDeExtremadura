
package universidaddeextremadura;

import java.util.ArrayList;


public class NoOficial extends Master{
    
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public NoOficial(String titulo, String especialidad, int codigo, Facultad facultad) {
        super(especialidad, codigo, facultad);
        this.titulo = titulo;
    }

    
}
