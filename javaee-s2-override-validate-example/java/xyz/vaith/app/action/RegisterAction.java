package xyz.vaith.app.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

public class RegisterAction extends ActionSupport {
    private String name;
    private String pass;
    private int age;
    private Date birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public void validate() {
        System.out.println("进入validate方法进行效验" + name);
//        if (!name.contains("wee")) {
//            addFieldError("user", "您的用户名必须包含wee");
//        }
    }

    public String register() throws Exception {
        return SUCCESS;
    }

    public void validateRegister() {
        System.out.println("进入validateRegister()方法进行校验");
        if (!name.contains("vaith")) {
            addFieldError("name", "您的用户名必须包含vaith");
        }
    }
}
