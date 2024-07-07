package extends1.ex3;

public class Book extends Item{
    public String author;
    public int isbn;

    public Book(String name, int price, String author, int isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }
    @Override
    public void print() {
        System.out.println("이름 : " + super.getName() + " 가격 : " + super.getPrice() + " 저자 : " + this.author + " 일련번호 : " + this.isbn );
    }
}
