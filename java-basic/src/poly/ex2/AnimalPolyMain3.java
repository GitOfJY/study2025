package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        // 1. 다형적 참조
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};

        // iter > 향상된 for문 단축키
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }

    }

    // control + alt + M > 코드 선택 후 메서드 추출 단축키
    // 변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        // 2. 오버라이딩한 메서드
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
