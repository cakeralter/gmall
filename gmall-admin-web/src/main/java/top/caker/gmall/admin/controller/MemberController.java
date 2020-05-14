package top.caker.gmall.admin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.caker.gmall.ums.entity.Member;
import top.caker.gmall.ums.service.MemberService;

import java.util.List;

/**
 * @author cakeralter
 * @date 2020/5/14
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Reference
    private MemberService memberService;

    @GetMapping
    public List<Member> list() {
        return memberService.list();
    }
}
