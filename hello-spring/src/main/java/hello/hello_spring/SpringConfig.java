package hello.hello_spring;

import hello.hello_spring.aop.TimeTraceAop;
import hello.hello_spring.repository.*;
import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Time;

@Configuration
public class SpringConfig {

    // 자바 코드로 직접 스프링 빈 등록하기

    // private DataSource dataSource;

    // @Autowired
    // public SpringConfig(DataSource dataSource) {
    //     this.dataSource = dataSource;
    // }

    // private EntityManager em;

    // @Autowired
    // public SpringConfig(EntityManager em) {
    //     this.em = em;
    // }

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        // return new MemberService(memberRepository());
        return new MemberService(memberRepository);
    }

    // @Bean
    // public MemberRepository memberRepository() {
        // return new MemoryMemberRepository();
        // return new JdbcMemberRepository(dataSource);
        // return new JdbcTemplateMemberRepository(dataSource);
        // return new JpaMemberRepository(em);
    // }

    // @Bean
    // public TimeTraceAop timeTraceAop() {
    //     return new TimeTraceAop();
    // }
    // AOP에 직접 @Component 어노테이션으로 주입 가능

}
