package xyz.vaith.app.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import xyz.vaith.app.bean.User;

@Results({@Result(name = "success", location = "/WEB-INF/content/welcome.jsp"), @Result(name = "input", location = "/WEB-INF/content/input.jsp")})
public class LoginAction extends ActionSupport {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
