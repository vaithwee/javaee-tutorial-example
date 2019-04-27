package xyz.vaith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/modelAttribute")
public class ModelAttribute1Controller {
    @ModelAttribute("loginname")
    public String userModel1 (@RequestParam("loginname") String loginname) {
        return loginname;
    }

    @RequestMapping("/login1")
    public String login1() {
        return "result1";
    }
}
