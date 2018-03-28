package com.springboot.reactive.SprintgBootReactive;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.Map;

@Controller
public class HomeController {

    @Value("${welcome.message}")
    private String message;

    @RequestMapping("/")
    public String hello(Map<String,Object> model) throws IOException {
            return "redirect:hello";

    }

    @RequestMapping("hello")
    public String hello2(Map<String,Object> model) throws IOException {
        model.put("message",message);
        return "hello";

    }

}
