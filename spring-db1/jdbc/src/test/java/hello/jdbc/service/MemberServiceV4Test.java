package hello.jdbc.service;

import hello.jdbc.domain.Member;
import hello.jdbc.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Slf4j
@SpringBootTest
class MemberServiceV4Test {
    public static final String MEMBER_A = "memberA";
    public static final String MEMBER_B = "memberB";
    public static final String MEMBER_EX = "ex";

    @Autowired
    private MemberRepository repository;

    @Autowired
    private MemberServiceV4 service;

    @TestConfiguration
    static class testConfig {
        private final DataSource dataSource;

        public testConfig(final DataSource dataSource) {
            this.dataSource = dataSource;
        }

        @Bean
        MemberRepository memberRepository() {
            // return new MemberRepositoryV4_1(dataSource);
            // return new MemberRepositoryV4_2(dataSource);
            return new MemberRepositoryV5(dataSource);
        }

        @Bean
        MemberServiceV4 memberService() {
            return new MemberServiceV4(memberRepository());
        }
    }

    @AfterEach
    void after() {
        repository.delete(MEMBER_A);
        repository.delete(MEMBER_B);
        repository.delete(MEMBER_EX);
    }

    @Test
    void accountTransfer() {
        // given
        Member memberA = new Member(MEMBER_A, 10000);
        Member memberB = new Member(MEMBER_B, 10000);
        repository.save(memberA);
        repository.save(memberB);

        // when
        service.accountTransfer(memberA.getMemberId(), memberB.getMemberId(), 2000);

        // then
        Member findA = repository.findById(memberA.getMemberId());
        Member findB = repository.findById(memberB.getMemberId());
        assertThat(findA.getMoney()).isEqualTo(8000);
        assertThat(findB.getMoney()).isEqualTo(12000);
    }

    @Test
    void accountTransferEx() {
        // given
        Member memberA = new Member(MEMBER_A, 10000);
        Member memberB = new Member(MEMBER_EX, 10000);
        repository.save(memberA);
        repository.save(memberB);

        // when
        assertThatThrownBy(() -> service.accountTransfer(memberA.getMemberId(), memberB.getMemberId(), 2000))
                .isInstanceOf(IllegalArgumentException.class);

        // then
        Member findA = repository.findById(memberA.getMemberId());
        Member findB = repository.findById(memberB.getMemberId());
        assertThat(findA.getMoney()).isEqualTo(10000);
        assertThat(findB.getMoney()).isEqualTo(10000);
    }

}