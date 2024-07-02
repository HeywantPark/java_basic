package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();

        //data.privateField = 2; private 접근 불가
        //data.privateMethod();  private 접근 불가

        data.defaultField = 3;
        data.defaultMethod();

        data.innerAccess();

    }
}
