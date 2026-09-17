public class Book {

    String title;
    String author;
    int price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 100;
    }

    void display() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java", "James", 500);
        Book b3 = new Book("Python", "Guido");

        b1.display();
        b2.display();
        b3.display();
    }
}