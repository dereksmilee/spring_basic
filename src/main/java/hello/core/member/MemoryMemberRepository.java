package hello.core.member;

import java.util.HashMap;
import java.util.Map;
// alt+enter 누르면 대부분 해결
public class MemoryMemberRepository implements MemberRepository{

//Map을 이용해 저장소를 만듦
    private static Map<Long, Member> store = new HashMap<>();
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);

    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
