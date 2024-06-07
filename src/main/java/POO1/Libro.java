package POO1;

/**/
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    public static void mostrarDetalles(Libro objeto){

       System.out.println(objeto);
    }

    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año de Publicación: " + anioPublicacion;
    }

}
