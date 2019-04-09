package xyz.vaith.app.action;

import com.opensymphony.xwork2.ActionSupport;
import xyz.vaith.app.service.MyService;

public class LoginAction extends ActionSupport {
    private String username;
    private String password;
    private MyService ms;

    public void setMs(MyService ms) {
        this.ms = ms;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        if (ms.validLogin(username, password) > 0) {
            addActionMessage("哈哈, 整合成功");
            return SUCCESS;
        }
        return ERROR;
    }
}
