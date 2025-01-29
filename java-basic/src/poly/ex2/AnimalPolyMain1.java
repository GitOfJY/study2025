package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        // 1. 다형적 참조
        //Cow cow = new Cow();
        Animal cow = new Cow();
        // Animal은 부모이기 때문에 dog, cat, cow 모두 담을 수 있다.
        
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

    }

    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");

        // 2. 메서드 오버라이딩
        animal.sound();
        // animal.sound(); > dog.sound();
        // 오버라이딩한 메서드는 우선순위를 갖는다.

        System.out.println("동물 소리 테스트 종료");
    }
}
