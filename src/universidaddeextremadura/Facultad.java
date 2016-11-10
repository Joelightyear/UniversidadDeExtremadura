package universidaddeextremadura;

import java.util.ArrayList;

public class Facultad {

    private String direccion;
    private String ciudad;
    private int num_facultades;
    static ArrayList<Estudio> estudios = new ArrayList<>();

    public Facultad(String direccion, String ciudad) {
        if (num_facultades < 100) {
            this.direccion = direccion;
            this.ciudad = ciudad;
            num_facultades++;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public static ArrayList<Estudio> getEstudios() {
        return estudios;
    }

    public static void setEstudios(ArrayList<Estudio> estudios) {
        Facultad.estudios = estudios;
    }

    public void addEstudio(Estudio estudios) {
        this.addEstudio(estudios);
    }

    public static final int num_estudios = 10;

    public void mostrar() {
        System.out.println(this.ciudad);
    }
}
