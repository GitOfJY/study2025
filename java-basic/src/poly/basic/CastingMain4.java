package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {

        // 다운캐스팅을 자동으로 하지 않는 이유
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        // child2.childMethod(); 불가능
        // Exception in thread "main" java.lang.ClassCastException: class poly.basic.Parent cannot be cast to class poly.basic.Child
        
    }
}
