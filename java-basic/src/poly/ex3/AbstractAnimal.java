package poly.ex3;

public abstract class AbstractAnimal {
    // abstract가 붙은 추상클래스,  직접 인스턴스를 생성할 수 없다.

    public abstract void sound();
    // 추상메서드가 하나라도 있는 클래스는 추상클래스로 선언해야 한다.
    // 추상메서드는 상속 받는 자식 클래스가 반드시 오버라이딩해서 사용해야 한다.
    // 추상메서드는 바디부분을 갖을 수 없다.
    // 자식이 오버라이딩 해야하는 목적으로 생성

    public void move() {
        // 자식이 기능을 상속받아 사용할 목적으로 생성
        System.out.println("동물이 움직입니다.");
    }

}
