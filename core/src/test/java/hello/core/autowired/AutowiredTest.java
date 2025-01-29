package hello.core.autowired;

import hello.core.member.Member;
import jakarta.annotation.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean {

        // 1. @Autowired(required=false) : 자동 주입할 대상이 없으면 수정자 메서드 자체가 호출 안 됨
        @Autowired(required = false)
        public void serNoBean1(Member noBean1) {
            System.out.println("noBean1 = " + noBean1);
            // 의존 관계가 없으면 메서드 자체가 호출 안 됨
        }

        // 2. org.springframework.lang.@Nullable : 자동 주입할 대상이 없으면 null이 입력 됨
        @Autowired
        public void setNoBean2(@Nullable Member noBean2) {
            System.out.println("noBean2 = " + noBean2);
            // noBean2 = null
        }

        // 3. Optional<> : 자동 주입할 대상이 없으면 Optional.empty가 입력 됨
        @Autowired
        public void setNoBean3(Optional<Member> noBean3) {
            System.out.println("noBean3 = " + noBean3);
            // noBean3 = Optional.empty
        }

    }

}
