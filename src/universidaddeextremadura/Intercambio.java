
package universidaddeextremadura;


public class Intercambio extends Alumno{
    
    private String uni_origen;

    public String getUni_origen() {
        return uni_origen;
    }

    public void setUni_origen(String uni_origen) {
        this.uni_origen = uni_origen;
    }

    public Intercambio(String uni_origen, String nombre, int edad) {
        super(nombre, edad);
        this.uni_origen = uni_origen;
    }
    
}
