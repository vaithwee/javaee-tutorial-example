package xyz.vaith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import xyz.vaith.domain.User;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping(path = "/anno")
@SessionAttributes(value = {"msg"})
public class AnnoController {
    @RequestMapping("/requestParams")
    public String requestParams(@RequestParam(name = "name") String username) {
        System.out.println("username:" + username);
        return "success";
    }

    @RequestMapping("/requestBody")
    public String requestBody(@RequestBody String body) {
        System.out.println("body:" + body);
        return "success";
    }

    @RequestMapping("/pathVariable/{sid}")
    public String pathVariable(@PathVariable(name = "sid") String id) {
        System.out.println("sid:" + id);
        return "success";
    }

    @RequestMapping("/requestHeader")
    public String requestHeader(@RequestHeader(name = "Accept") String header) {
        System.out.println("Accept:" + header);
        return "success";
    }

    @RequestMapping("/cookieValue")
    public String cookieValue(@CookieValue(name = "JSESSIONID") String sessionId) {
        System.out.println("SessionID:" + sessionId);
        return "success";
    }

    @RequestMapping("/modelAttribute")
    public String modelAttribute(@ModelAttribute("abc") User user) {
         System.out.println(user);
         return "success";
    }

    @ModelAttribute
    public void validateUser(String name, Map<String, User> map) {
        User user = new User();
        user.setAge(20);
        user.setName(name);
        user.setBirthday(new Date());
        map.put("abc", user);
    }

    @RequestMapping("/addSession")
    public String addSession(Model model) {
        model.addAttribute("msg", "hello spring mvc");
        return "success";
    }

    @RequestMapping("/getSession")
    public String getSession(ModelMap modelMap) {
        System.out.println(modelMap.get("msg"));
        return "success";
    }

    @RequestMapping("/delSession")
    public String delSession(SessionStatus status) {
        status.setComplete();
        return "success";
    }
}
