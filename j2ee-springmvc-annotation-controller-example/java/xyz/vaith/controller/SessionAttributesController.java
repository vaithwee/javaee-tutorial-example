package xyz.vaith.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import xyz.vaith.domain.User;

@Controller
@SessionAttributes("user")
@RequestMapping("/sessionAttributes")
public class SessionAttributesController {
    private static final Log logger = LogFactory.getLog(SessionAttributesController.class);

    @RequestMapping("/{formName}")
    public String loginForm(@PathVariable String formName) {
        return formName;
    }

    @RequestMapping("/login")
    public String login(@RequestParam("loginname") String loginname, @RequestParam("password") String password, Model model) {
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername("admin");
        model.addAttribute("user", user);
        return "welcome";
    }
}
