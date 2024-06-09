package EjercicioSistema_gestion;

import java.util.List;

/*Clase Biblioteca:

Atributos:
ArrayList<Libro> libros (referencia a la clase Libro)
ArrayList<Autor> autores (referencia a la clase Autor)
ArrayList<Categoria> categorias (referencia a la clase Categoria)
*/
public class Biblioteca {
    private List<Libro> libros;
    private List<Autor> autores;
    private List<Categorias> categoria;

    //Constructor que inicialice las listas vacías.
    public Biblioteca(){}
    public Biblioteca(List<Libro> libros, List<Autor> autores, List<Categorias> categorias) {
        this.libros = libros;
        this.autores = autores;
        this.categoria = categorias;
    }

    //Método agregarLibro(Libro libro) que añada un libro a la lista de libros de la biblioteca.-

    public void agregarLibro(Libro book) {

        this.libros.add(book);
    }

    //Método agregarAutor(Autor autor) que añada un autor a la lista de autores de la biblioteca.

    public void agregarAutor(Autor autor) {
        this.autores.add(autor);
    }
    // Método agregarCategoria(Categoria categoria) que añada una categoría a la lista de categorías de la biblioteca.

    public void agregarCategoria(List<Categorias> categorias) {
        this.categoria.addAll(categorias);
    }

    // Método listarLibros() que imprima todos los libros en la biblioteca.

    public void listarLibros() {
        for (Libro libro : this.libros) {
            System.out.println(libro);
        }
    }
//o :
//    public List<Libro> listarLibros(List<Libro> librazo){
//        return librazo;
//    }
    //    Método listarAutores() que imprima todos los autores en la biblioteca.
//se que esta mal imprimir
    public void listarAutores(List<Autor> autorcitos) {
        for (Autor autor : autorcitos) {
            System.out.println(autor);
        }
    }

    //seria asi sino?
//    public List<Autor> listarLibros(List<Autor> autorcitos) {
//
//        return autorcitos;
//    }


   // Método listarCategorias() que imprima todas las categorías en la biblioteca.

    public void listarCategorias(List<Categorias> cate){
        for ( Categorias categorias:cate){
            System.out.println(categorias);
        }
    }
}
