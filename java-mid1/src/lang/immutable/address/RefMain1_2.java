package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {

        Address a = new Address("서울");
        Address b = new Address("서울");
        // 사이드이팩트 해결 방안 > 처음부터 다른 인스턴스를 참조하게 한다.
        // 객체를 공유하지 않는다.
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        // a = Adress{value='서울'}
        // b = Adress{value='부산'}

    }
}
