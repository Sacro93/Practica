package POO2;
import POO1.Libro;
import POO2.Curso;
import POO2.Estudiante;

/* Agrega los estudiantes al curso utilizando el método correspondiente.

        Llama al método para mostrar los detalles de todos los estudiantes inscritos en el curso y verifica que todo funcione correctamente.
*/

public class Main {

    public static void main (String[] args){

        Estudiante estu = new Estudiante("Francisco" , 15 , "6");
        Estudiante estu2 = new Estudiante("Francisco" , 31 , "6");
        Estudiante estu3 = new Estudiante("Francisco" , 31 , "6");

        Curso primeroB = new Curso("1B");

        primeroB.agregarEstudiante(estu);
        primeroB.agregarEstudiante(estu2);
        primeroB.agregarEstudiante(estu3);

       primeroB.mostrarEstudiantesinscriptos();
       primeroB.totalInscripciones();
        primeroB.listaMayoresEdad();


    }
}



