package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    // @Autowired private MemberService memberService;
    // 위와 같은 [필드 방식]은 좋은 방법이 아님.

    // 필드 주입, setter 주입, 생성자 주입 이렇게 3가지 방법이 있는데,
    // 의존 관계가 실행중에 동적으로 변하는 경우는 거의 없으므로 생성자 주입을 권장한다.


    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
