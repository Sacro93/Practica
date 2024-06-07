package POO2;

public class Estudiante {
    private String nombre;
    private int edad;
    private String grado;


    public Estudiante(String n, int e, String g) {

        this.nombre = n;
        this.edad = e;
        this.grado = g;
    }

    public static void mostrarInformacion(Estudiante estudiante) {

        System.out.println(estudiante);
    }

    public String toString(){
      return   "Datos :" + nombre +","+ edad +","+ grado;
    }
}
