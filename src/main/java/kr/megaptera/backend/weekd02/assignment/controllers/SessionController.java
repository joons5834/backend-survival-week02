package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class SessionController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestAttribute String userId) {
        return "유저 " + userId + " 이/가 로그인했습니다.";
    }

    @DeleteMapping
    public String delete(@RequestAttribute String userId) {
        return "유저 " + userId + " 이/가 로그아웃했습니다.";
    }
}
