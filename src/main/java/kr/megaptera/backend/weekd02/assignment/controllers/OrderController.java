package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @GetMapping("/me")
    public String list(@RequestAttribute String userId) {
        return userId + "의 주문 목록\n";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestAttribute String userId,
                         @RequestBody String orderDTO) {
        return userId + "이/가" + orderDTO + " 주문합니다\n";
    }
}
