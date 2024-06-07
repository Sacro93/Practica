package POO2;

import java.util.ArrayList;
import java.util.List;


public class Curso {
    private String nombreCurso;
    private List<Estudiante> estudiantesInscriptos;


    public Curso(String nombreCurso) {
        this.estudiantesInscriptos = new ArrayList<>();
        this.nombreCurso = nombreCurso;
    }

    public void agregarEstudiante(Estudiante estudiante) {

        estudiantesInscriptos.add(estudiante);

    }

    public void mostrarEstudiantesinscriptos() {
        for (Estudiante e : this.estudiantesInscriptos) {
            System.out.println(e.toString());
        }
    }

    public String toString() {
        return "Curso" + estudiantesInscriptos + "nombre Curso" + nombreCurso;
    }

    //Metodo para obtener la cantidad de estudiantes inscriptos


    public void totalInscripciones() {

        int resultado = this.estudiantesInscriptos.size();

        System.out.println(resultado);

    }

    // Metodo que devuelve una lista con los estudiantes que son mayores de edad

    public List<Estudiante> listaMayoresEdad() {

        List<Estudiante> listaMayorEdad = new ArrayList<>();

        for (Estudiante est : this.estudiantesInscriptos) {
            if (est.getEdad() >= 18) {

                listaMayorEdad.add(est);
            }
        }

        for (Estudiante estu :listaMayorEdad){
            System.out.println(estu);
        }
        return listaMayorEdad;
    }

}
