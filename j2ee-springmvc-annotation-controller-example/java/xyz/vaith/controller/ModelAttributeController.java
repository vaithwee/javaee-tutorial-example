package xyz.vaith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/modelAttribute")
public class ModelAttributeController {
    @RequestMapping("/{formName}")
    public String loginForm(@PathVariable("formName") String formName) {
        return formName;
    }
}
