package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService {

    // private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository;

    @Autowired // ac.getBean(MemberRepository.class)
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
        // MemberServiceImpl 입장에서는 생성자를 통해 어떤 구현 객체가 주입될지 알 수 없다
        // 1. AppConfig에서 MemoryMemberRepository 주입 (생성자주입)
        // 2. @Autowired AutoAppConfig에서 의존관계 자동으로 주입
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // 테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }

}
