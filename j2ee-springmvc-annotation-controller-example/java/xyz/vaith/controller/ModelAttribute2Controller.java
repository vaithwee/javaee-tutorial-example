package xyz.vaith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/modelAttribute")
public class ModelAttribute2Controller {
    @ModelAttribute
    public void userModel2 (@RequestParam("loginname") String loginname, @RequestParam("password") String password, Model model) {
        model.addAttribute("loginname", loginname);
        model.addAttribute("password", password);
    }

    @RequestMapping("/login2")
    public String login1() {
        return "result2";
    }
}
