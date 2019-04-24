package xyz.vaith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorController {

    @RequestMapping("/test1")
    public String test1() {
        return "success";
    }
}
