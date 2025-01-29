package hello.core;

import hello.core.member.*;
import hello.core.order.Order;
import hello.core.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {

        // 1.
        // MemberService memberService = new MemberServiceImpl();
        // OrderService orderService = new OrderServiceImpl();

        // 2.
        // AppConfig appConfig = new AppConfig();
        // OrderService orderService = appConfig.orderService();
        // MemberService memberService = appConfig.memberService();

        // 3. ApplicationContext (스프링컨테이너) 사용
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 20000);

        System.out.println("order = " + order);
        System.out.println("order = " + order.calculatePrice());

    }
}
