package EjercicioSistema_gestion;

import java.util.Arrays;
import java.util.List;

import static util.MyList.listOf;

/*
* Objetivos:
                        Crear las clases mencionadas.
                        Implementar los atributos y métodos requeridos.
                        Demostrar la funcionalidad de las clases en un método main que haga lo siguiente:
                        Crear varios autores, libros y categorías.
                        Asignar libros a autores y categorías a libros.
                        Agregar autores, libros y categorías a la biblioteca.
                        Listar todos los libros, autores y categorías presentes en la biblioteca.*/
public class Main {

    public static void main(String[] args) {

        List<Autor> autorcitos = listOf(
                new Autor("Fran", "Sacro"),
                new Autor("Alejandra", "Gomez"),
                new Autor("Nicolas", "Cane"),
                new Autor("Pedro", "Gonzalez")
        );

        List<Categorias> categorias = listOf(
                new Categorias("Terror"),
                new Categorias("Romance"),
                new Categorias("Comedia"),
                new Categorias("Psicologia")
        );


        //teoria que busque

        /*El método Arrays.asList() en Java se utiliza para convertir un arreglo (array)
        o una secuencia de elementos en una lista. En este caso, categorias.get(0) devuelve el primer elemento de la
        lista categorias, que es un objeto de tipo Categoria.Entonces, Arrays.asList(categorias.get(0)) toma ese objeto Categoria y lo convierte en una lista que
         contiene un único elemento, que es el objeto Categoria obtenido de categorias.get(0).*/
        List<Libro> librazos = listOf(
                new Libro("jamas", "123", autorcitos.get(1), Arrays.asList(categorias.get(0))),
                new Libro("Nunca", "444", autorcitos.get(1), Arrays.asList(categorias.get(1))),
                new Libro("Holii", "55", autorcitos.get(0), Arrays.asList(categorias.get(1))),
                new Libro("See", "41", autorcitos.get(0), Arrays.asList(categorias.get(2))),
                new Libro("Siempre", "10", autorcitos.get(2), Arrays.asList(categorias.get(3))),
                new Libro("Algo", "1", autorcitos.get(3), Arrays.asList(categorias.get(3)))
        );


    //Agregar autores, libros y categorías a la biblioteca.

        Biblioteca bibliotecaza=new Biblioteca();
        bibliotecaza.agregarCategoria(
        bibliotecaza.agregarCategoria(categorias.get(1));
        bibliotecaza.agregarCategoria(categorias.get(2));
        bibliotecaza.agregarCategoria(categorias.get(3));

        bibliotecaza.agregarAutor(autorcitos.get(0));
        bibliotecaza.agregarAutor(autorcitos.get(1));
        bibliotecaza.agregarAutor(autorcitos.get(2));
        bibliotecaza.agregarAutor(autorcitos.get(3));

        bibliotecaza.agregarLibro(librazos.get(0));
        bibliotecaza.agregarLibro(librazos.get(1));
        bibliotecaza.agregarLibro(librazos.get(2));
        bibliotecaza.agregarLibro(librazos.get(3));
        bibliotecaza.agregarLibro(librazos.get(4));
        bibliotecaza.agregarLibro(librazos.get(5));


        //Listar todos los libros, autores y categorías presentes en la biblioteca

        bibliotecaza.listarLibros();

    }
}
