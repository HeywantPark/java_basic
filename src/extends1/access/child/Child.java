package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        pubicValue = 1;
        protectedValue = 1; // 상속 관계 or 같은 패키지 접근 가능
        //defaultValue = 1; // 다른 패키지에서 접근 불가
       //privateValue = 1; // 접근 불가

        publicMethod();
        protectedMethod(); // 상속 관계 or 같은 패키지 접근 가능
        //defaultMethod(); // 다른 패키지에서 접근 불가
        //privateMethod(); // 접근 불가

        printParent();
    }
}
