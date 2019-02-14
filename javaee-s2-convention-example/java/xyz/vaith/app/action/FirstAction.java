package xyz.vaith.app.action;

import com.opensymphony.xwork2.ActionSupport;

public class FirstAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("进入第一个Action");
        addActionMessage("第一个Action的提示信息");
        return "second";
    }
}
