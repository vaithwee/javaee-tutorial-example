package xyz.vaith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String hello() {
        System.out.println("hello");
        return "success";
    }

    @RequestMapping(path = "/helloWithName")
    public String hello(String username) {
        System.out.println("username:" + username);
        return "success";
    }

    @RequestMapping(path = "/helloWithPost", method = {RequestMethod.POST})
    public String helloWithPost() {
        System.out.println("helloWithPost");
        return "success";
    }

    @RequestMapping(path = "/servlet")
    public String servlet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request);
        System.out.println(response);
        return "success";
    }
}
