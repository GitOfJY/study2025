package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        // 1.
        // ThreadA : A사용자가 10000원 주문
        // statefulService1.order("userA", 10000);
        // ThreadB : B사용자가 20000원 주문
        // statefulService2.order("userB", 20000);

        // ThreadA : A사용자가 주문 금액 조회
        // int price = statefulService1.getPrice();
        // System.out.println("price = " + price);
        // name = userA price = 10000
        // name = userB price = 20000
        // price = 20000

        // 공유되는 필드 price를 특정 사용자가 변경하는 문제 발생
        // 스프링빈은 항상 무상태로 설계
        // Assertions.assertThat(statefulService1.getPrice()).isEqualTo(20000);

        // 2.
        int userAPrice = statefulService1.order("userA", 10000);
        int userBPrice = statefulService1.order("userB", 20000);

        System.out.println("price = " + userAPrice);

    }

    static class TestConfig {
        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }

}