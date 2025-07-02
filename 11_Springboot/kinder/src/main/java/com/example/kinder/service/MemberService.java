package com.example.kinder.service;

import com.example.kinder.domain.Member;
import com.example.kinder.dto.MemberCreateDto;
import com.example.kinder.exception.UserNotFoundException;
import com.example.kinder.repository.MemberRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public Member create(MemberCreateDto memberCreateDto) {
        //이메일 중복 검사
        if (memberRepository.existsByEmail(memberCreateDto.getEmail())) {
            throw new UserNotFoundException("이미 존재하는 이메일입니다.");

        }
        //전화번호 중복검사
        if (memberRepository.existsPhone(memberCreateDto.getPhone_number())) {
            throw new UserNotFoundException("이미 존재하는 전화번호입니다.");
        }

        //생성
        Member member = Member.builder()
                .name(memberCreateDto.getName())
                .email(memberCreateDto.getEmail())
                .password(passwordEncoder.encode(memberCreateDto.getPassword()))
                .phone(memberCreateDto.getPhone_number())
                .build();

        memberRepository.save(member);
        return member;
    }

    public Member login(String email, String password) {
        Optional<Member> optmember = memberRepository.findByEmail(email);
        if (optmember.isPresent()) {
            throw new UserNotFoundException("이메일이 존재하지 않습니다.");
        }

        Member m = optmember.get();
        if (!passwordEncoder.matches(password, m.getPassword())) {
            throw new UserNotFoundException("비밀번호가 일치하지 않습니다.");
        }
        return m;
    }
}
