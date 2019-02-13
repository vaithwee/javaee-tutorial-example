package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport {
    private String target;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
