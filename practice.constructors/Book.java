
class Book {

    String title;
    String author;
    double price;

    Book(String a, String b) {
        title = a;
        author = b;
    }

    Book(String a, String b, double c) {
        title = a;
        author = b;
        price = c;

    }

    public static void main(String[] args) {
        Book b = new Book("marvel", "gently");
        Book b1 = new Book("rich dad poor dad", "aditya", 500);
        System.out.println(b1.title + " " + b1.author + " " + b1.price);
        System.out.println(b.title + " " + b.author);

    }
}
