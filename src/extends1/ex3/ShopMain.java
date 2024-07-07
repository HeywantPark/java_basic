package extends1.ex3;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("java",10000,"han",38721);
        Album album = new Album("앨범",30000,"아이유","꽃갈피");
        Movie movie = new Movie("매드맥스",15000,"john","tom");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("총 합계 가격 : " + sum);
    }
}
