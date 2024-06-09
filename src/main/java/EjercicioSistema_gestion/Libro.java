package EjercicioSistema_gestion;

import java.util.ArrayList;
import java.util.List;

/*
* Atributos:
String titulo
String isbn
Autor autor (referencia a la clase Autor)
ArrayList<Categoria> categorias (referencia a la clase Categoria)
*
Métodos:
Constructor que inicialice todos los atributos.
Métodos getter y setter para cada atributo.
Método toString() para imprimir los detalles del libro.*/
public class Libro {
    private String titulo;
    private String isbn;

    private Autor autor;

    private List<Categorias> categorias;

    public Libro(String titulo, String isbn, Autor autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.categorias = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<Categorias> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categorias> categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor=" + autor +
                ", categorias=" + categorias +
                '}';
    }
}
