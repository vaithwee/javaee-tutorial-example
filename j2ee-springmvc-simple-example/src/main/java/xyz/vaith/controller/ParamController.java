package xyz.vaith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.vaith.domain.Account;
import xyz.vaith.domain.User;

@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping(path = "/save", method = {RequestMethod.POST})
    public String save(Account account) {
        System.out.println(account);
        return "success";
    }

    @RequestMapping(path = "/user", method = {RequestMethod.POST})
    public String user(User user) {
        System.out.println(user);
        return "success";
    }
}
