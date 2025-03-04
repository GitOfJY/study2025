package hello.login.domain.login;

import hello.login.domain.member.Member;
import hello.login.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginSerive {
    private final MemberRepository memberRepository;

    // @return null 로그인 실패
    public Member login(String loginId, String password) {

        /* sol1.
        Optional<Member> findMemberOptional = memberRepository.findByLoginId(loginId);
        Member member = findMemberOptional.get();
        if (member.getPassword().equals(password)) {
            return member;
        } else {
            return null;
        }
         */

        /* sol2.
        Optional<Member> byLoginId = memberRepository.findByLoginId(loginId);
        byLoginId.filter(m -> m.getPassword().equals(password))
                .orElse(null);
         */

        // sol3.
        return memberRepository.findByLoginId(loginId)
                .filter(m -> m.getPassword().equals(password))
                .orElse(null);
    }

}
