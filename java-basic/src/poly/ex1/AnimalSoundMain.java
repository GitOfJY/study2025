package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        // new Cow() + control + alt + v

        // Caw[] cawArr = {dog, cat, cow };
        // 2. 마찬가지로 타입이 다르기 때문에 (배열+for문)도 사용할 수 없다.

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        /*
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
        */

        soundCow(cow);
        // soundCow(cat);
        // 1. 타입이 다르기 때문에 메서드 사용 불가능

    }

    private static void soundCow(Cow cow){
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
