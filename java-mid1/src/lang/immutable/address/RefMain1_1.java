package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {

        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;
        // a에 있는 참조값을 복사해서 b에 전달한다.
        // 참조값을 복사해서 전달하므로 결과적으로 a, b는 같은 인스턴스를 참조한다.
        // 객체를 공유한다.
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        b.setValue("부산");
        // b의 값을 부산으로 변경해야 한다.
        System.out.println("부산 -> b");
        System.out.println("a = "+a);
        // 사이드이펙트 발생
        // 사이드이펙트는 프로그래밍에서 어떤 계산이 주된 작업 외에 추가적인 부수 효과를 일으키는 것을 말한다.
        System.out.println("b = "+b);
        // a = Adress{value='부산'}
        // b = Adress{value='부산'}

    }
}
