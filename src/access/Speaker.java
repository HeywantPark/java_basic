package access;

public class Speaker {
    private int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }
    void volumeUp () {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume+= 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }
    void volumeDown () {
        volume-=10;
        System.out.println("음량을 10 줄입니다.");
    }
    void showVolume (){
        System.out.println("현재 음량은 : " + volume);
    }
}
