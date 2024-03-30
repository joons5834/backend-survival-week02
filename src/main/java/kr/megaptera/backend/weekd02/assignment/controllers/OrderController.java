package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders/me")
public class OrderController {
    @GetMapping
    public String list(@RequestAttribute String userId) {
        return userId + "의 주문 목록\n";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestAttribute String userId) {
        return userId + "이 주문합니다\n";
    }
}
