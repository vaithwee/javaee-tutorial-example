package xyz.vaith.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletRequest;
import java.util.ArrayList;
import java.util.List;

public class GetBooksTarget implements Runnable {

    private AsyncContext asyncContext = null;

    public GetBooksTarget(AsyncContext asyncContext) {
        this.asyncContext = asyncContext;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5 * 1000);
            ServletRequest request = asyncContext.getRequest();
            List<String> books = new ArrayList<>();
            books.add("疯狂Java讲义");
            books.add("轻量级JavaEE企业应用实战");
            books.add("疯狂Ajax讲义");
            request.setAttribute("books", books);
            asyncContext.dispatch("/async.jsp");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
