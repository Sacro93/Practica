package EjercicioSistema_gestion;

import java.util.ArrayList;
import java.util.List;

/*Atributos:
String nombre
String apellido
ArrayList<Libro> libros (referencia a la clase Libro)
Métodos:
Constructor que inicialice nombre y apellido.
Métodos getter y setter para cada atributo.
Método agregarLibro(Libro libro) que añada un libro a la lista de libros del autor.
Método toString() para imprimir los detalles del autor.
*/
public class Autor {
    private String nombre;
    private String apellido;
    private List<Libro> librosAutor;

    public Autor(String nombre, String apellido) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.librosAutor= new ArrayList<>();

    }

    public void agregarLibro(Libro libro){
     this.librosAutor.add(libro);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", librosAutor=" + librosAutor +
                '}';
    }
}
