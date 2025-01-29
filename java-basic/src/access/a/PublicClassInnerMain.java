package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // default > 동일한 패키지 내에서 접근 가능하다.
        DefaulClass1 class1 = new DefaulClass1();
        DefaulClass2 class2 = new DefaulClass2();
    }
}
