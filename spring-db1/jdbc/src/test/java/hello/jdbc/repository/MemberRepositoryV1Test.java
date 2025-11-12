package hello.jdbc.repository;

import com.zaxxer.hikari.HikariDataSource;
import hello.jdbc.connection.ConnectionConst;
import hello.jdbc.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.SQLException;
import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@Slf4j
class MemberRepositoryV1Test {
    MemberRepositoryV1 repository;

    @BeforeEach
    void beforeEach() {
        // 1. 기본 DataManager - 항상 새로운 커넥션 생성
        DriverManagerDataSource dataSource = new DriverManagerDataSource(ConnectionConst.URL, ConnectionConst.USERNAME, ConnectionConst.PASSWORD);

        // 2. 커넥션 풀링
        // HikariDataSource dataSource = new HikariDataSource();
        // dataSource.setJdbcUrl(ConnectionConst.URL);
        // dataSource.setUsername(ConnectionConst.USERNAME);
        // dataSource.setPassword(ConnectionConst.PASSWORD);

        repository = new MemberRepositoryV1(dataSource);
    }

    @Test
    void save() throws SQLException, InterruptedException {
        // save
        Member member = new Member("memberV100", 10000);
        repository.save(member);

        // findByID
        Member findMember = repository.findById(member.getMemberId());
        log.info("findMember={}", findMember.toString());
        // findMember=Member(memberId=memberV1, money=10000)
        assertThat(findMember).isEqualTo(member);

        // update
        repository.update(member.getMemberId(), 30000);
        Member updateMember = repository.findById(member.getMemberId());
        assertThat(updateMember.getMoney()).isEqualTo(30000);

        // delete
        repository.delete(updateMember.getMemberId());
        assertThatThrownBy(() -> repository.findById(member.getMemberId()))
                .isInstanceOf(NoSuchElementException.class);

        Thread.sleep(10000);
    }

}