package xyz.vaith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.RequestContext;
import xyz.vaith.domain.User;

import javax.servlet.http.HttpServletRequest;

@Controller
public class I18lController {
    @RequestMapping("/{formName}")
    public String loginForm(@PathVariable String formName, Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return formName;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute @Validated User user, Model model, HttpServletRequest request) {
        if (user.getLoginname().equals("wee") && user.getPassword().equals("123")) {
            RequestContext requestContext = new RequestContext(request);
            String username = requestContext.getMessage("username");
            user.setUsername(username);
            model.addAttribute("user", user);
            return "success";
        }
        return "error";
    }
}
