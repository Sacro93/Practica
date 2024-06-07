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

    // Metodo: refleja un comportamiento de la clase
    public void mostrarDetalles(){
        // this apunta a la instancia sobre la que llamo el metodo
        // 1ro librito 1
        // 2ndo librito 2

        // Imprimiendo la instancia en la que estoy parado
        String detalle = "Título: " + this.titulo + ", Autor: " + this.autor + ", Año de Publicación: " + this.anioPublicacion;
        System.out.println(detalle);
    }

    public int aniosDesdePublicacion(int anioActual) {
        return anioActual - this.anioPublicacion;
    }


}
