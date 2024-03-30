package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestParam("product_id") String productId,
                         @RequestAttribute String userId,
                         @RequestBody String commentDTO) {
        return userId + "이/가" + productId + " 상품에 리뷰 작성 "
                + commentDTO + "\n";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable String id,
                         @RequestAttribute String userId,
                         @RequestBody String reviewDTO) {
        return userId + "이/가 " + id + " 리뷰 수정\n" + reviewDTO + "\n";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id,
                         @RequestAttribute String userId) {
        return userId + "이/가 " + id + " 리뷰 삭제\n";
    }
}
