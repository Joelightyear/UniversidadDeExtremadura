package universidaddeextremadura;

import java.util.ArrayList;

public class UniversidadDeExtremadura {

    static ArrayList<Facultad> facultades = new ArrayList<>();

    public static void rellenarDatos() {

        Facultad f;
        Grado g;
        Master m;

        for (int i = 0; i < 10; i++) {

            f = new Facultad("Badajoz " + i, "Avd. de Elvas S/N " + i);
            //f.setCiudad("Badajoz " + i);
            f.setDireccion("Avd. de Elvas S/N " + i);
            facultades.add(f);

            for (int j = 0; j < 10; j++) {

                g = new Grado("Semestre " + j, 4324 + j, f);
                f.addEstudio(g);
                m = new Master("Estadística Analítica " + j, 8356 + j, f);
                f.addEstudio(m);

                Regular r;
                Becario b;
                Intercambio in;

                for (int k = 0; k < 10; k++) {

                    r = new Regular("Joel " + k, 24 + k);
                    b = new Becario("Departamento " + k, "Becario " + k, 22 + k);
                    in = new Intercambio("Universidad de Panamá " + k, "Alumno Intercambio " + k, 22 + k);
                    
                    g.addAlumno(b);
                    m.addAlumno(in);                   
                }
            }
        }
    }

    public static void main(String[] args) {
        rellenarDatos();

    }

}
