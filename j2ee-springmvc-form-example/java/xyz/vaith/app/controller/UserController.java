package xyz.vaith.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.vaith.app.domain.CheckBox;
import xyz.vaith.app.domain.Dept;
import xyz.vaith.app.domain.Employee;
import xyz.vaith.app.domain.User;
import xyz.vaith.app.validator.UserValidator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm(Model model) {
        User user = new User("jack", "男", 18);
        model.addAttribute("command", user);
        return "registerForm";
    }
    @RequestMapping(value = "/register2", method = RequestMethod.GET)
    public String registerForm2(Model model) {
        User user = new User("jack", "男", 18);
        model.addAttribute("user", user);
        return "registerForm2";
    }

    @RequestMapping(value = "/checkBoxForm", method = RequestMethod.GET)
    public String checkBoxForm(Model model) {
        CheckBox checkBox = new CheckBox();
        checkBox.setReader(true);
        List<String> list = new ArrayList<>();
        list.add("JavaEE");
        list.add("Spring");
        checkBox.setCourses(list);
        model.addAttribute("checkBox", checkBox);

        List<String> list2 = new ArrayList<>();
        list2.add("JavaEE");
        list2.add("Spring");
        list2.add("MyBatis");
        list2.add("Android");
        model.addAttribute("list", list2);
        return "checkBoxForm";
    }

    @RequestMapping(value = "/checkBoxForm2", method = RequestMethod.GET)
    public String checkBoxForm2(Model model) {
        CheckBox checkBox = new CheckBox();
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("3");
        checkBox.setCourses(list);

        Map<String, String> courseMap = new HashMap<>();
        courseMap.put("1", "JavaEE");
        courseMap.put("2", "Spring");
        courseMap.put("3", "MyBatis");
        model.addAttribute("checkBox", checkBox);
        model.addAttribute("courseMap", courseMap);
        return "checkBoxForm2";
    }

    @RequestMapping(value = "/checkBoxForm3", method = RequestMethod.GET)
    public String checkBoxForm3(Model model) {
        Employee employee = new Employee();
        Dept dept = new Dept(1, "研发部");
        List<Dept> list = new ArrayList<>();
        list.add(dept);
        employee.setDepts(list);
        List<Dept> deptList = new ArrayList<>();
        deptList.add(dept);
        deptList.add(new Dept(2, "销售部"));
        deptList.add(new Dept(3, "财务部"));
        model.addAttribute("employee", employee);
        model.addAttribute("deptList", deptList);
        return "checkBoxForm3";
    }

    @RequestMapping(value = "/radioButtonForm", method = RequestMethod.GET)
    public String radioButtonForm(Model model) {
        User user = new User();
        user.setSex("男");
        model.addAttribute("user", user);
        return "radioButtonForm";
    }

    @RequestMapping(value = "/radioButtonForm2", method = RequestMethod.GET)
    public String radioButtonForm2(Model model) {
        User user = new User();
        user.setSex("男");
        model.addAttribute("user", user);
        List<String> sexList = new ArrayList<>();
        sexList.add("男");
        sexList.add("女");
        sexList.add("未知");
        model.addAttribute("sexList", sexList);
        return "radioButtonForm2";
    }

    @RequestMapping(value = "/radioButtonForm3", method = RequestMethod.GET)
    public String radioButtonForm3(Model model) {
        User user = new User();
        user.setSex("1");
        model.addAttribute("user", user);
        Map<String, String> sexMap = new HashMap<>();
        sexMap.put("1", "男");
        sexMap.put("2", "女");
        sexMap.put("3", "未知");
        model.addAttribute("sexMap", sexMap);
        return "radioButtonForm3";
    }

    @RequestMapping(value = "/selectForm", method = RequestMethod.GET)
    public String selectForm(Model model) {
        User user = new User();
        user.setDeptId(2);
        model.addAttribute("user", user);
        return "selectForm";
    }

    @RequestMapping(value = "/selectForm2", method = RequestMethod.GET)
    public String selectForm2(Model model) {
        User user = new User();
        user.setDeptId(2);
        model.addAttribute("user", user);
        Map<Integer, String> deptMap = new HashMap<>();
        deptMap.put(1, "财务部");
        deptMap.put(2, "开发部");
        deptMap.put(3, "销售部");
        model.addAttribute("deptMap", deptMap);
        return "selectForm2";
    }

    @RequestMapping(value = "/selectForm3", method = RequestMethod.GET)
    public String selectForm3(Model model) {
        User user = new User();
        user.setDeptId(2);
        model.addAttribute("user", user);
        Dept dept = new Dept(1, "研发部");

        List<Dept> deptList = new ArrayList<>();
        deptList.add(dept);
        deptList.add(new Dept(2, "销售部"));
        deptList.add(new Dept(3, "财务部"));
        model.addAttribute("deptList", deptList);
        return "selectForm3";
    }

    @RequestMapping(value = "/register3", method = RequestMethod.GET)
    public String registerForm3(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "registerForm3";
    }

    @InitBinder
    public void initBinder(DataBinder binder) {
        binder.setValidator(new UserValidator());
    }

    @RequestMapping(value = "/register3", method = RequestMethod.POST)
    public String register(@Validated User user, Errors errors) {
        if (errors.hasFieldErrors()) {
            return "registerForm3";
        }
        return "submit";
    }
}
