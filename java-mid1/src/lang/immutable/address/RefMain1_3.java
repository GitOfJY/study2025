package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {

        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        change(b, "부산");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        // a = Adress{value='부산'}
        // b = Adress{value='부산'}
        // 여러 변수가 하나의 객체를 참조하는 공유 참조를 막을 수 있는 방법은 없다.

    }

    public static void change(Address address, String changeAddress){
        // Address 인스턴스에 있는 value 값을 변경한다.
        System.out.println("주소 값을 변경합니다. -> "+changeAddress);
        address.setValue(changeAddress);
    }
}
