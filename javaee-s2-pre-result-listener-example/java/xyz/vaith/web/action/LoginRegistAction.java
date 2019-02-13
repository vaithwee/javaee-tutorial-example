package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.PreResultListener;

import java.util.Date;

public class LoginRegistAction extends ActionSupport {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String regist() throws Exception {
        ActionContext.getContext().getSession().put("user", getUsername());
        addActionMessage("恭喜您, " + getUsername() + ", 您已经注册成功!");
        return SUCCESS;
    }

    @Override
    public String execute() throws Exception {
        ActionInvocation invocation = ActionContext.getContext().getActionInvocation();
        invocation.addPreResultListener(new PreResultListener() {
            @Override
            public void beforeResult(ActionInvocation invocation, String resultCode) {
                System.out.println("返回的逻辑的名称为: " + resultCode);
                invocation.getInvocationContext().put("extra", new Date() + "由" + resultCode + "逻辑视图名转入");
            }
        });

        if (getUsername().equals("wee") && getPassword().equals("123")) {
            ActionContext.getContext().getSession().put("user", getUsername());
            addActionMessage("欢迎, " + getUsername() + ", 您已经登录成功!") ;
            return SUCCESS;
        }
        return ERROR;
    }
}
