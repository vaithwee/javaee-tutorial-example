package xyz.vaith.app.action;

import com.opensymphony.xwork2.ActionSupport;

public class ProAction extends ActionSupport {

    private String book;

    public void setBook(String book) {
        this.book = book;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
