package xyz.vaith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.vatih.execption.SysExecption;

@Controller
public class ExecptionController {
    @RequestMapping("/testExecption1")
    public String testExecption1() throws Exception {
        System.out.println("executing method");
        try {
            int i = 1/ 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysExecption("自定义错误信息");
        }
        return "success";
    }
}
