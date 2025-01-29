package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
// 애플리케이션의 전체 동작 방식을 구성(config)하기 위해 1.구현 객체를 생성하고 2.연결하는 책임을 가지는 별도의 설정 클래스
public class AppConfig {

    // 애플리케이션의 실제 동작에 필요한 구현 객체 생성
    // public MemberService memberService() {
        // 생성한 객체 인스턴스의 참조(레퍼런스)를 생성자를 통해 주입(연결)
        // return new MemberServiceImpl(new MemoryMemberRepository());
    // }

    // command + option + m
    // AppConfig 리팩토링
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private static MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        // 클라이언트 코드인 MemberServiceImpl를 포함해 사용영역의 코드는 변경할 필요가 없다
        // 구성영역의 AppConfig만 수정하면 된다
        // return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
*/

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    // @Bean
    public static MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

}
