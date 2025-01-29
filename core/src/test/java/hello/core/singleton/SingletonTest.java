package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {

    @Test
    @DisplayName("스프링 없는 순수한 DI 컨테이너")
    void pureContainter() {
        AppConfig appConfig = new AppConfig();

        // 1. 조회 : 호출할 때 마다 객체 생서
        MemberService memberService1 = appConfig.memberService();

        // 2. 조회 : 호출할 때 마다 객체 생서
        MemberService memberService2 = appConfig.memberService();

        // 참조값이 다른 것 확인
        System.out.println("memberServie1 = " + memberService1);
        System.out.println("memberServie2 = " + memberService2);
        // memberServie1 = hello.core.member.MemberServiceImpl@6295d394
        // memberServie2 = hello.core.member.MemberServiceImpl@475e586c

        // memberSrvice1 != memberService2
        assertThat(memberService1).isNotSameAs(memberService2);

        // 스프링 없는 순수한 DI 컨테이너인 AppConfig는 요청을 할 때 마다 객체 새로 생성
        // 객체가 1개만 생성되고 공유하도록 설계 > 싱글톤 패턴
    }

    @Test
    @DisplayName("싱글톤 패턴을 적용한 객체 사용")
    void singletonServiceTest() {
        SingletonService singletonService1 = SingletonService.getInstance();
        SingletonService singletonService2 = SingletonService.getInstance();

        // 호출 할 때 마다 같은 객체 반환 (참조값 같음)
        System.out.println("singletonService1 = " + singletonService1);
        System.out.println("singletonService2 = " + singletonService2);
        // singletonService1 = hello.core.singleton.SingletonService@78b1cc93
        // singletonService2 = hello.core.singleton.SingletonService@78b1cc93

        // singletonService1 == singletonService2
        assertThat(singletonService1).isSameAs(singletonService2);
    }

    @Test
    @DisplayName("스프링 컨테이너와 싱글톤")
    void springContainer() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService1 = ac.getBean("memberService", MemberService.class);
        MemberService memberService2 = ac.getBean("memberService", MemberService.class);

        System.out.println("memberServie1 = " + memberService1);
        System.out.println("memberServie2 = " + memberService2);
        // memberServie1 = hello.core.member.MemberServiceImpl@2f62ea70
        // memberServie2 = hello.core.member.MemberServiceImpl@2f62ea70

        // memberSrvice1 == memberService2
        assertThat(memberService1).isSameAs(memberService2);

        // 스프링 컨테이너 덕분에 고객 요청이 올 때 마다 객체를 생성하는 것이 아니라 이미 만들어진 객체를 공유해서 효율적으로 재사용할 수 있다
        // 참고. 스프링의 기본 빈 등록 방식은 싱글톤이지만, 싱글톤 방식만 지원하는 것은 아니다
    }

}
