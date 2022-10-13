package reflection;

public class DependencyInjectionTest {

    public static void main(String[] args) throws Exception {
        DependencyInjection dependencyInjection = new DependencyInjection();
        MemberService memberService = dependencyInjection.getInstance(MemberService.class);
        System.out.println("memberService = " + memberService);
        System.out.println("memberService.memberRepository = " + memberService.memberRepository);
    }
}

// >> 결과
//        memberService = reflection.MemberService@3551a94
//        memberService.memberRepository = reflection.MemberRepository@531be3c5
