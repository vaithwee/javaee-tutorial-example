package xyz.vaith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import xyz.vaith.domain.User;

@Controller
public class UserController {
    @RequestMapping("/testString")
    public String testString(Model model) {
        model.addAttribute("msg", "hello, spring mvc");
        return "success";
    }

    @RequestMapping("/testVoid")
    public void testVoid() {
        System.out.println("test void method executing");
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "this message form model and view");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/testForwardAndRedirect")
    public String testForwardAndRedirect() {
        System.out.println("testForwardAndRedirect method executing");
//        return "forward:/WEB-INF/pages/success.jsp";
        return "redirect:index.jsp";
    }

    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user) {
        System.out.println("testAjax methdo executing");
        System.out.println(user);
        return user;
    }

}
