package xyz.vaith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.vaith.domain.User;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/modelAttribute")
public class ModelAttribute4Controller {
    @RequestMapping("/login4")
    @ModelAttribute("username")
    public String login4() {
        return "admin";
    }
}
