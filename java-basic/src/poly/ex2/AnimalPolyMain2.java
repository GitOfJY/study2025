package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        // 1. 다형적 참조
        // Animal 타입의 배열을 만들고 다형적 참조 이용
        Animal[] animalArr = {dog, cat, cow};

        // iter > 향상된 for문 단축키
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            // 2. 오버라이딩한 메서드
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }

    }

}
