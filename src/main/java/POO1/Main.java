package POO1;

public class Main {

    public static void main(String[] args) {

        Libro librito = new Libro("El hombre en busqueda de sentido", "Victor Frankl", 1955);
        Libro librito2 = new Libro("Harry Potter", "JK Rowling", 1991);


        librito.mostrarDetalles();
        librito2.mostrarDetalles();

        int aniosDesdePublicacionLibrito1 = librito.aniosDesdePublicacion(2024);
    }
}
