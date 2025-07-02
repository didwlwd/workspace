package com.example.kinder.controller;

import com.example.kinder.auth.JwtTokenProvider;
import com.example.kinder.domain.Member;
import com.example.kinder.dto.MemberCreateDto;
import com.example.kinder.service.MemberService;
import jakarta.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    private final JwtTokenProvider jwtTokenProvider;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@Valid @RequestBody MemberCreateDto memberCreateDto) {
        Member member = memberService.create(memberCreateDto);
        return new ResponseEntity<>(member.getId(), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(String email, String password) {
        Member member = memberService.login(email, password);
        String jwtToken = jwtTokenProvider.createToken(member.getEmail(), member.getRole());
        Map<String, Object> loginInfo = new HashMap<>();
        loginInfo.put("token", jwtToken);
        return new ResponseEntity<>(loginInfo, HttpStatus.OK);

    }
}
