package EjercicioSistema_gestion;
/*Clase Categoria:

Atributos:
String nombre
Métodos:
Constructor que inicialice el nombre.
Método getter y setter para el nombre.
Método toString() para imprimir los detalles de la categoría.*/
public class Categorias {

    private String nombre;

    public Categorias(String nombre){
        this.nombre=nombre;
    }

    @Override
    public String toString() {
        return "Categorias{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
