package xyz.vaith.app.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;
import java.util.Map;

public class AuthorityDownAction extends ActionSupport {
    private String inputPath;

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    public InputStream getTargetFile() throws Exception {
        return ServletActionContext.getServletContext().getResourceAsStream(inputPath);

    }

    @Override
    public String execute() throws Exception {
        ActionContext ctx = ActionContext.getContext();
        Map session = ctx.getSession();
        String user = (String)session.get("user");
        if (user != null && user.equals("wee")) {
            return SUCCESS;
        }
        ctx.put("tip", "您还满意登录, 或者登录的用户名不正确, 请重新登录");
        return LOGIN;
    }
}
