package poly.ex4;

public class Dog extends AbstractAnimal {

    // control + o
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 움직입니다.");
    }
}
