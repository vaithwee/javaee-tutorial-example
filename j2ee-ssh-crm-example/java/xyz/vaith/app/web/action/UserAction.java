package xyz.vaith.app.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import xyz.vaith.app.domain.User;
import xyz.vaith.app.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();
    @Override
    public User getModel() {
        return user;
    }

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String register() throws Exception {
        userService.regist(user);
        return SUCCESS;
    }

    public String login() throws Exception {
       User loginUser =  userService.login(user);
       if (loginUser == null) {
           addActionError("用户名或者密码错误");
           return INPUT;
       } else  {
           ActionContext.getContext().getSession().put("user", user);
           return SUCCESS;
       }
    }
}
