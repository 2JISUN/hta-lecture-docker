package com.JISUN.ch01.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller //타임리프 추가 후
@Slf4j //lombok 추가 후
public class TestController {
    @GetMapping("/")
    public String home(@RequestParam int age,
                       @RequestParam String name) {
        log.info("age==={}===name==={}", age, name);
        return "index";
    }
}