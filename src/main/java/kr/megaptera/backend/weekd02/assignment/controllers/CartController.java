package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart-items")
public class CartController {

    @GetMapping
    public String list(@RequestAttribute String userId) {
        return userId + "의 장바구니 목록\n";
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestAttribute String userId,
                         @RequestBody String itemDTO) {
        return userId + "의 장바구니에 " + itemDTO + "이/가 추가\n";
    }

    @DeleteMapping("/{id}")
    public String delete(@RequestAttribute String userId,
                         @PathVariable String id) {
        return userId + "의 장바구니에서 " + id + "를 삭제\n";
    }

}
