package hello.jdbc.repository;

import hello.jdbc.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@Slf4j
class MemberRepositoryV0Test {
    MemberRepositoryV0 repository = new MemberRepositoryV0();

    @Test
    void save() throws SQLException {
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
    }

}