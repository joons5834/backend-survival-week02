package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/me")
    public String view(@RequestAttribute String userId) {
        return userId + "의 정보\n";
    }

    @PatchMapping("/me")
    public String update(@RequestAttribute String userId,
                         @RequestBody String updateDTO) {
        return userId + "의 정보 중 " + updateDTO + " 수정\n";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestBody String updateDTO) {
        return updateDTO + " 회원가입 완료\n";
    }


}
