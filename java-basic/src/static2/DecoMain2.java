package static2;

public class DecoMain2 {
    public static void main(String[] args) {

        String s = "Hello Java";
        String deco = DecoUtil2.deco(s);
        // (static) 정적 메서드는 객체 생성 없이 클래스명으로 바로 호출할 수 있다.
        // deco 메서드는 단순히 기능만 담고 있기 때문에 객체 생성의 의미가 없다.

        System.out.println("before: "+s);
        System.out.println("after: "+deco);

    }
}
