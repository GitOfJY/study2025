package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {

        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);
        // return 값을 받지 않았기 때문에 기존값이 출력된다.
        
        System.out.println("obj1 = "+obj1.getValue());
        // obj1 = 10
        
    }
}
