package POO5;

public class Book {

    private String name;
    private Author author;
    private double price;
    private int qty;

    public  Book( String name, Author author, double price){
        this.name= name;
        this.author=author;
        this.price= price;
        this.qty=0;

    }
    public  Book( String name, Author author, double price,int qty){
        this.name= name;
        this.author=author;
        this.price= price;
        this.qty = qty;

    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // (Advanced) The Author and Book Classes Again - An Array of Objects as an Instance Variable

    /*Introduce new methods called getAuthorName(),
    getAuthorEmail(), getAuthorGender()
     in the Book class to return the name, email and gender of the author of the book.*/

    public  String  getAuthorName(){
      return this.author.getName();
    }
    public char getAuthorGender(){
        return this.author.getGender();
    }

    public String getAuthorMail(){
        return this.author.getEmail();
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}
