package poly.ex4;

public abstract class AbstractAnimal {

    public abstract void sound();
    public abstract void move();
    // 클래스의 모든 메서드가 추상 메서드 > 순수 추상 클래스
    // 순수 추상 클래스는 실행 로직을 전혀 가지고 있지 않다.
    // 다형성을 위한 부모 타입으로써 껍데기 역할만 제공한다.

}
