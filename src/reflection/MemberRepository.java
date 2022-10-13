package reflection;

import java.lang.reflect.Member;
import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    Map<Integer, Member> memberIdToMemberMap = new HashMap<>();

    public Member getById(Integer memberId) {
        return memberIdToMemberMap.get(memberId);
    }
}
