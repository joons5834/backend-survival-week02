package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @GetMapping
    public String list(@RequestAttribute String userId) {
        return userId + "의 장바구니 목록\n";
    }

    @PostMapping("/{itemId}")
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestAttribute String userId,
                         @PathVariable String itemId) {
        return userId + "의 장바구니에 " + itemId + "를 추가\n";
    }

    @DeleteMapping("/{itemId}")
    public String delete(@RequestAttribute String userId,
                         @PathVariable String itemId) {
        return userId + "의 장바구니에서 " + itemId + "를 삭제\n";
    }

}
