package xyz.vaith.app.action;

import com.opensymphony.xwork2.ActionSupport;

public class DemoAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        addActionError("第一条错误信息");
        addActionError("第二天错误信息");
        addActionMessage("第一条普通信息");
        addActionMessage("第二条普通信息");
        return SUCCESS;
    }
}
