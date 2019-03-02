package xyz.vaith.app.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import java.util.Map;
@Results({@Result(name = "success", location = "/WEB-INF/content/welcome.jsp"),
@Result(name = "input", location = "/WEB-INF/content/loginForm.jsp")})
public class LoginAction extends ActionSupport {
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

    @Override
    public String execute() throws Exception {
        if (getUsername().equals("wee") && getPassword().equals("123")) {
            ActionContext context = ActionContext.getContext();
            Map session = context.getSession();
            session.put("user", "wee");
            return SUCCESS;
        }
        return INPUT;
    }
}
