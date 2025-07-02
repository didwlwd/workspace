package com.example.kinder.controller;

import com.example.kinder.exception.UserNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestEceptionController {

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable Long id) {
        if (id <= 0) {
            throw new UserNotFoundException("ID가" + id + "인 사용자를 찾을 수 없습니다.");
        }
        return "사용자 정보" + id;
    }

    @GetMapping("/illegal")
    public String testIllegalArgument(@RequestParam Integer number) {
        if (number < 0) {
            throw new IllegalArgumentException("음수는 허용되지 않습니다. :" + number);
        }

        return "정상응답 : " + number;
    }
}
