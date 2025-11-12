package hello.jdbc.service;

import hello.jdbc.domain.Member;
import hello.jdbc.repository.MemberRepositoryV1;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Slf4j
@RequiredArgsConstructor
public class MemberServiceV2 {
    private final MemberRepositoryV1 repository;
    private final DataSource dataSource;

    public void accountTransfer(String fromId, String toId, int money) throws SQLException {
        Connection connection = dataSource.getConnection();
        try {
            // 트랜잭션 시작
            connection.setAutoCommit(false);

            // 비즈니스 로직
            bizLogic(fromId, toId, money, connection);
            
            // 성공시 커밋
            connection.commit();
        } catch (Exception e) {
            // 실패시 롤백
            connection.rollback();
        } finally {
            release(connection);
        }
    }

    private void bizLogic(String fromId, String toId, int money, Connection connection) throws SQLException {
        Member fromMember = repository.findById(connection, fromId);
        Member toMember = repository.findById(connection, toId);

        repository.update(fromId, fromMember.getMoney() - money);
        validation(toMember);
        repository.update(toId, toMember.getMoney() + money);
    }

    private void release(Connection connection) throws SQLException {
        if (connection != null) {
            try {
                connection.setAutoCommit(true);
                connection.close();
            } catch (Exception e) {
                log.info("error", e);
            }
        }
    }

    private void validation(Member member) {
        if (member.getMemberId().equals("ex")) {
            throw new IllegalArgumentException("예외 발생");
        }
    }
}
