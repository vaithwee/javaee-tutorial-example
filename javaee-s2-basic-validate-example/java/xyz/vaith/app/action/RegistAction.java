package xyz.vaith.app.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import java.util.Date;
@Results({
        @Result(name = "success", location = "/WEB-INF/content/welcome.jsp"),
        @Result(name = "input", location = "/WEB-INF/content/registForm.jsp")
})
public class RegistAction extends ActionSupport {
    private String user;
    private String pass;
    private int age;
    private Date birth;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String login() throws Exception {
        return SUCCESS;
    }

}
