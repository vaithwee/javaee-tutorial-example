package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;
import xyz.vaith.base.MyException;

import java.sql.SQLException;

public class LoginAction extends ActionSupport {

    private String username;
    private String password;
    private String tip;

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

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public String execute() throws Exception {
        if (getUsername().equalsIgnoreCase("user")) {
            throw new MyException("自定义异常");
        }

        if (getUsername().equalsIgnoreCase("sql")) {
            throw new SQLException("用户名不能为sql");
        }

        if (getUsername().equals("wee") && getPassword().equals("123")) {
            addActionMessage("哈哈, 服务器提示!");
            return SUCCESS;
        }
        return ERROR;
    }
}
