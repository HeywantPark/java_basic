package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++; //정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능

        //instanceValue++; 인스턴스 변수 접근 불가 compile error
        //instanceMethod(); 인스턴스 메서드 접근 불가 compile error

    }
    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근가능
        instanceMethod(); // 인스턴스 메서드 접근 가능

        staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능
    }

    private static void staticMethod() {
        System.out.println("staticMethod = " + staticValue);
    }
    private void instanceMethod() {
        System.out.println("instanceMethod = " + instanceValue);
    }
}
