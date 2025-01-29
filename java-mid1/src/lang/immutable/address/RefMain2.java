package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {

        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;
        // 참조값 대입을 막을 수 있는 방법은 없다.
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        // b.setValue("부산");
        // 컴파일 오류, ImmutableAddress 불변 객체의 값을 변경할 수 없다.
        b = new ImmutableAddress("부산");
        // 변경을 위해, 새로운 인스턴스 생성한다.
        System.out.println("부산 -> b");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        // a = ImmutableAddress{value='서울'}
        // b = ImmutableAddress{value='부산'}

    }
}
