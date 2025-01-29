package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {

        Car car = new Car();
        Dog dog = new Dog();

        action(dog);
        action(car);

    }

    private static void action(Object obj){

        // obj.sound();
        // obj.move();
        // 컴파일오류, Object는 sound()와 move()가 없다.

        // 객체에 맞는 downcasting 필요
        if (obj instanceof Dog dog){
            dog.sound();
            // ((Dog)dog).sound();
        } else if ((obj instanceof Car car)){
            car.move();
        }

    }
}
