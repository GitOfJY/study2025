package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {

        Car car = new Car("Model Y");
        Dog dog = new Dog("강아지1", 2);
        Dog dog1 = new Dog("강아지2", 3);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog.toString());
        System.out.println(dog1.toString());
        System.out.println();

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog);
        System.out.println(dog1);
        System.out.println();

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog);
        ObjectPrinter.print(dog1);
        System.out.println();

        // 참조값 출력
        int i = System.identityHashCode(dog1);
        System.out.println(i); // 51228289
        String s = Integer.toHexString(i);
        System.out.println(s); // 30dae81

    }
}
