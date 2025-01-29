package hello.core.order;

import hello.core.annotation.MainDiscountPolicy;
import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
// @RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    // private final MemberRepository memberRepository = new MemoryMemberRepository();

    // 할인 정책 변경 (FixDiscountPolicy -> RateDiscountPolicy)
    // 1. DIP 위반
    // 클라이언트(OrderServiceImpl)가 인터페이스(DiscountPolicy) 뿐만 아니라 구체 클래스(FixDiscountPolicy, RateDiscountPolicy)도 함께 의존하고 있다
    // 2. OCP 위반
    // FixDiscountPolicy에서 RateDiscountPolicy로 변경하는 순간(기능을 확장하는 순간) OrderServiceImpl도 변경해야 한다(클라이언트 코드도 수정 필요하다)

    // private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    // private final DiscountPolicy discountPolicy = new RateDiscountPolicy();

    // 인터페이스에만 의존하도록 코드 수정
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    // final > 기본으로 생성자 할당되어야 함
    /*
    * 1. 생성자 주입
    * 생성자 호출 시점에서 1번만 호출되는 것을 보장
    * "불변, 필수" 의존관계에서 사용
    * 생성자가 1개라면 @Autowired 생략 가능, 자동으로 의존관계 생성
    * */
    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository,
                            // @Qualifier("mainDiscountPolicy") DiscountPolicy discountPolicy) {
                             @MainDiscountPolicy DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    /*
    * 2. 수정자 주입 (setter 주입)
    * setter라 불리는 필드의 값을 변경하는 수정자 메서드를 통해 의존관계를 주입하는 방식
    * "선택, 변경" 가능성이 있는 의존관계에서 사용
    * 자바빈 프로퍼티 규약의 수정자 메서드 방식을 사용하는 방식
    *  */
    // private MemberRepository memberRepository;

    // @Autowired
    // public void setMemberRepository(MemberRepository memberRepository) {
    //     this.memberRepository = memberRepository;
    // }

    /*
    * 3. 필드 주입
    * 필드에 바로 주입하는 방법
    * 코드가 간결하지만 외부에서 변경이 불가능해 테스트 하기 힘들다는 단점
    * DI 프레임 워크가 없으면 아무것도 할 수 없다
    * 사용하지 말기
    *     - 애플리케이션의 실제 코드와 관계 없는 테스트 코드
    *     - 스프링 설정을 목적으로 하는 @Configuration 같은 곳에서만 특별한 용도로 사용
    * */
    // @Autowired private MemberRepository memberRepository;

    /*
    * 4. 일반 메서드 주입
    * 일반 메서드를 통해 주입 받을 수 있다
    * 한번에 여러 필드를 주입 받을 수 있다
    * 일반적으로 잘 사용하지 않는다
    * */
    // @Autowired
    // public void init(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
    //     this.memberRepository = memberRepository;
    //     this.discountPolicy = discountPolicy;
    // }

    // @RequiredArgsConstructor
    // 롬복 > final 키워드가 붙은 필드의 생성자 자동 생성

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    // 테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }

}
