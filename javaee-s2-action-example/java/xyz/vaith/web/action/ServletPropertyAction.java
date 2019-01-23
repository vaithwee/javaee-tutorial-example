package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class ServletPropertyAction extends ActionSupport implements ServletResponseAware {
    private String username;
    private String password;
    private HttpServletResponse response;

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
        ActionContext context = ActionContext.getContext();
        Integer counter = (Integer)context.getApplication().get("counter");
        if (counter == null) {
            counter = 1;
        } else {
            counter += 1;
        }
        context.getApplication().put("counter", counter);
        context.getSession().put("user", getUsername());
        if (getUsername().equals("wee") && getPassword().equals("123")) {
            Cookie c = new Cookie("user", getUsername());
//            response.addCookie(c);
            ServletActionContext.getResponse().addCookie(c);
            context.put("tip", "服务器" +
                    "提示: 您已经成功登录");
            return SUCCESS;
        }

        context.put("tip", "服务器提示: 登录失败");
        return ERROR;
    }

    @Override
    public void setServletResponse(javax.servlet.http.HttpServletResponse httpServletResponse) {
        this.response = httpServletResponse;
    }
}
