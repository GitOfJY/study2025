package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);

        // 회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA : "+memberA);
        System.out.println("memberB : "+memberB);

        // 회원B의 주소를 부산으로 변경한다.
        memberB.getAddress().setValue("부산");
        // 사이드이팩트 발생
        System.out.println("부산 > memberB.address");
        System.out.println("memberA : "+memberA);
        System.out.println("memberB : "+memberB);
        // memberA : MemberV1{name='회원A', address=Address{value='부산'}}
        // memberB : MemberV1{name='회원B', address=Address{value='부산'}}

    }
}
