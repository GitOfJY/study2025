package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal>{

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public <T> T printAndReturn(T t) {

        System.out.println("animal.className : " + animal.getClass().getName());
        System.out.println("t.className : " + t.getClass().getName());
        // t.getName();
        // 호출 불가 메서드는 <T> 타입이다. <T extends Animal> 타입이 아니다.
        return t;

        // 제네릭 타입보다 제네릭 메서드가 높은 우선순위를 가진다.
        // 둘 중 하나의 이름을 변경하는 것 권장

    }

}
