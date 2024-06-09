package POO5;

public class Main {
    public static void main(String[] args) {

        Author autorcito = new Author(" Fran , ", "fran@gmail.com ,", 'm');

    Book librito= new Book("Java for dummy", autorcito,15.50,99);

        System.out.println(librito.getAuthorMail());
        System.out.println(librito.getAuthor().getName());
        System.out.println(librito.getPrice());
    }
}
