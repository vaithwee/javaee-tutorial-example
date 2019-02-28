package xyz.vaith.app.action;

import com.opensymphony.xwork2.ActionSupport;
import xyz.vaith.app.bean.User;

public class RegistAction extends ActionSupport {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
