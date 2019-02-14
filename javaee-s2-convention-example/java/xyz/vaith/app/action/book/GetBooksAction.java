package xyz.vaith.app.action.book;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import xyz.vaith.app.service.BookService;

public class GetBooksAction extends ActionSupport {
    private String[] books;

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    @Override
    public String execute() throws Exception {
        String user = (String) ActionContext.getContext().getSession().get("user");
        if (user != null && user.equals("wee")) {
            BookService bs = new BookService();
            setBooks(bs.getBooks());
            return SUCCESS;
        }
        return ERROR;
    }
}
