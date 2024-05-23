package com.example.blog.domain.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/templates/member")
public class MemberController {
    @GetMapping("/login")
    public String loginPage() {
        return "templates/member/login";
    }
}
