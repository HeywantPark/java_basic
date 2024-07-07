package extends1.ex3;

public class Album extends Item{
    private String artist;
    private String album;

    public Album(String name, int price, String artist, String album) {
        super(name, price);
        this.artist = artist;
        this.album = album;
    }
    @Override
    public void print() {
        System.out.println("이름 : " + super.getName() + " 가격 : " + super.getPrice() + " 아티스트 : " + this.artist + " 앨범명 : " + this.album );
    }
}
