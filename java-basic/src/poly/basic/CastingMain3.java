package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {

        // upcasting vs downcasting
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업케이스팅은 생략 가능, 생략 권장
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();

    }
}
