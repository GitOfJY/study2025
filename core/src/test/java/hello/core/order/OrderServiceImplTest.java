package hello.core.order;

import hello.core.discount.RateDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceImplTest {

    @Test
    void createOrder() {
        // OrderServiceImpl orderService = new OrderServiceImpl();
        // orderService.createOrder(1L, "itemA", 10000);
        // 수정자 주입 > NullPointExcpetion
        // 생성자 주입 > java: constructor OrderServiceImpl in class hello.core.order.OrderServiceImpl cannot be applied to given types;

        // 생성자 주입 test
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L, "name", Grade.VIP));
        OrderServiceImpl orderService = new OrderServiceImpl(memberRepository, new RateDiscountPolicy());
        Order order = orderService.createOrder(1L, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }
}
