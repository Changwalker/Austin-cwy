package com.cwy.austin.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    @RequestMapping("/test")
    public String test(){
        System.out.println("sout:nb");
        log.info("log:nbnbnb");
        return "GOGOGO!";
    }
}
