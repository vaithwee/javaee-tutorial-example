package xyz.vaith.app.action;

import com.opensymphony.xwork2.ActionSupport;
import xyz.vaith.app.bean.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoginAction extends ActionSupport {

    /*
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
            addActionMessage("转换成功");
            return SUCCESS;
        }
        addActionMessage("转换失败");
        return ERROR;
    }
    */

    /*
    private Map<String, User> users;

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(getUsers());

        if (getUsers().get("one").getUsername().equals("wee") && getUsers().get("one").getPassword().equals("123")) {
            addActionMessage("登录成功");
            return SUCCESS;
        }
        addActionMessage("登录失败");
        return ERROR;
    }
    */

    /*
    private ArrayList<User> users;

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    @Override
    public String execute() throws Exception {
        if (getUsers().get(0).getUsername().equals("wee") && getUsers().get(0).getPassword().equals("123")) {
            addActionMessage("登录成功");
            return SUCCESS;
        }
        addActionMessage("登录失败");
        return ERROR;
    }

    */

    private List users;

    public List getUsers() {
        return users;
    }

    public void setUsers(List users) {
        this.users = users;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(getUsers());
        User user = (User)getUsers().get(0);
        if (user.getUsername().equals("wee") && user.getPassword().equals("123")) {
            addActionMessage("登录成功");
            return SUCCESS;
        }
        addActionMessage("登录失败");
        return ERROR;

    }
}
