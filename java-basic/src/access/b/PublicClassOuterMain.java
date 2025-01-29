package access.b;

// import access.a.DefaulClass1;
// Cannot be accessed from outside package

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // default > 불가, 동일한 패키지 내에서 접근 가능하다.
        // DefaulClass1 class1 = new DefaulClass1();
        // DefaulClass2 class2 = new DefaulClass2();
    }
}
