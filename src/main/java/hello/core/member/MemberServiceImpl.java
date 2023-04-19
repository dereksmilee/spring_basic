package hello.core.member;

public class MemberServiceImpl implements MemberService {
    // ctrl+shift+enter 누르면 세미콜론까지 자동완성
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}