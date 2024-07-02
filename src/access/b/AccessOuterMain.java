package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();

        //data.privateField = 2; private 접근 불가
        //data.privateMethod();  private 접근 불가

        //data.defaultField = 3; 다른 패키지에서 default 접근 불가
        //data.defaultMethod();  다른 패키지에서 default 접근 불가

        data.innerAccess();

    }
}
