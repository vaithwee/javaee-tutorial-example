package xyz.vaith.app.action;

import com.opensymphony.xwork2.ActionSupport;

public class FirstSecondAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("进入第二个Action");
        addActionMessage("进入第二个Action");
        return SUCCESS;
    }
}
