package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("java","seo");
        book2.displayInfo();

        Book book3 = new Book("python","park",500);
        book3.displayInfo();
    }
}
