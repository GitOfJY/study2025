package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {

        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Object object = integerBox.get();
        Integer integer = (Integer)object;
        // Integer integer2 = (Integer)objectBox.get();
        // Object > Integer 다운캐스팅
        System.out.println("integer : " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        // Object > String 다운캐스팅
        System.out.println("str = " + str);

        // 잘못된 타입의 인수 전달시
        integerBox.set("문자열100");
        Integer result = (Integer) integerBox.get();
        System.out.println("result : " + result);
        // Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        // at generic.ex1.BoxMain2.main(BoxMain2.java:22)

    }
}
