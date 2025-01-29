package hello.core.scan;

import hello.core.AutoAppConfig;
import hello.core.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class AutoAppConfigTest {

    @Test
    void basicScan() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

        MemberService memberService = ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);

        // 자동 등록한 컴포넌트의 이름이 똑같은 경우 에러
        // @Component("service")
        // org.springframework.beans.factory.BeanDefinitionStoreException

        // 수동 등록한 컴포넌트의 이름이 똑같은 경우 성공
        // 수동 빈 등록이 우선권을 갖고 수동 빈이 자동 빈을 오버라이딩 해버린다
        // Overriding bean definition for bean 'memoryMemberRepository' with a different definition: replacing

        // 최근 스프링부트에서는 수동 빈 등록과 자동 빈 등록이 충돌나면 오류가 발생하도록 기본 값을 바꾸었다
        // CoreApplication 실행 시 에러 발생
        // Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true

    }
}
