package xyz.vaith.app.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Set;

public class LoginAction extends ActionSupport {
    private Set users;

    public Set getUsers() {
        return users;
    }

    public void setUsers(Set users) {
        this.users = users;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(users.toString());
        return SUCCESS;
    }
}
