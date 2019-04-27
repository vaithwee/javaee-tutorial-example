package xyz.vaith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.vaith.domain.User;

@Controller
@RequestMapping("/modelAttribute")
public class ModelAttribute5Controller {

    @ModelAttribute("user")
    public User userModel5(@RequestParam("loginname") String loginname, @RequestParam("password") String password) {
        User user = new User(loginname, password, "");
        return user;
    }

    @RequestMapping("/login5")
    public String login4(@ModelAttribute("user") User user) {
       user.setUsername("管理员");
       return "result5";
    }
}
