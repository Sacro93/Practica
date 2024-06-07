package POO2;

public class Estudiante {
    private String nombre;
    private int edad;
    private String grado;


    public Estudiante(String nombre, int edad, String grado) {

        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    public int getEdad() {
        return edad;
    }

    public String toString(){
      return   "Datos :" + nombre +","+ edad +","+ grado;
    }
}
