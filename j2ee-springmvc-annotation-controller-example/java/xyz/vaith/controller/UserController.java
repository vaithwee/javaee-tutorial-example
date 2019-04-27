package xyz.vaith.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.vaith.domain.User;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private static List<User> users;

    public UserController() {
        super();
        users = new ArrayList<User>();
    }

    private static final Log logger = LogFactory.getLog(UserController.class);

    @RequestMapping(value = "/register", method = {RequestMethod.GET})
    public String register() {
        logger.info("register get method executing");
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("loginname") String loginName, @RequestParam("username") String userName, @RequestParam("password") String pass) {
        logger.info("register post method executing");
        User user = new User();
        user.setLoginname(loginName);
        user.setUsername(userName);
        user.setPassword(pass);
        users.add(user);
        return "login";
    }

    @RequestMapping("/login")
    public String login(@RequestParam("loginname") String ln, @RequestParam("password") String pass, Model model) {
        logger.info("login name: "  + ln + ", password: " + pass);
        for (User user : users) {
            if (user.getLoginname().endsWith(ln) && user.getPassword().endsWith(pass)) {
                model.addAttribute("user", user);
                return "welcome";
            }
        }
        return "login";
    }
}
