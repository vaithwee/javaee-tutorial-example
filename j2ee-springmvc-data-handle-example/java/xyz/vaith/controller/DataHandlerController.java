package xyz.vaith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import xyz.vaith.converter.DateEditor;
import xyz.vaith.domain.User;

import java.util.Date;

@Controller
public class DataHandlerController {
    @RequestMapping("/{formName}")
    public String formName (@PathVariable String formName) {
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
}
