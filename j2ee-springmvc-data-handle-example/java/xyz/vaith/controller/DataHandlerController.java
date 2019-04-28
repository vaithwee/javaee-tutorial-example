package xyz.vaith.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import xyz.vaith.converter.DateEditor;
import xyz.vaith.domain.Account;
import xyz.vaith.domain.User;
import xyz.vaith.validator.UserValidator;

import javax.validation.Valid;


@Controller
public class DataHandlerController {
    @RequestMapping("/{formName}")
    public String formName (@PathVariable String formName, Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("account", new Account());
        return formName;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "success";
    }

    /*
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new DateEditor());
    }
    */

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "success";
    }

    @Autowired
    @Qualifier("userValidator")
    private UserValidator userValidator;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@ModelAttribute User user, Model model, Errors errors) {
        model.addAttribute("user", user);
        userValidator.validate(user, errors);
        if (errors.hasFieldErrors()) {
            return "loginForm";
        }
        return "success";
    }

    @RequestMapping(value = "/register2" , method = RequestMethod.POST)
    /*error 一定要放在 model 前面*/
    /*error 一定要放在 model 前面*/
    /*error 一定要放在 model 前面*/
    /*error 一定要放在 model 前面*/
    /*error 一定要放在 model 前面*/
    public String register2(@ModelAttribute @Valid Account account, BindingResult errors ,Model model ) {
        model.addAttribute("account", account);
        if (errors.hasErrors()) {
            return "registerForm2";
        }
        return "success2";
    }
}
