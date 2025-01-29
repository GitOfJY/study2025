package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{
    // extends를 통한 상속은 하나만 할 수 있고 implements를 통한 인터페이스는 다중 구현할 수 있다.
    // 따라서 함께 사용된 경우에는 extends 가 앞에 온다.

    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새가 날고 있습니다.");
    }
}
