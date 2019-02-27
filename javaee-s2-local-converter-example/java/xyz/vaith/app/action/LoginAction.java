package xyz.vaith.app.action;

import com.opensymphony.xwork2.ActionSupport;
import xyz.vaith.app.model.User;

public class LoginAction extends ActionSupport {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        if (getUser().getUsername().equals("wee") && getUser().getPassword().equals("123")) {
            addActionMessage("登录成功");
            return SUCCESS;
        }
        addActionMessage("登录失败");
        return ERROR;
    }
}
