package xyz.vaith.servlet;

import xyz.vaith.listener.MyAsyncListener;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AsyncServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("utf-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<title>异步调用示例</title>");
        writer.println("进入servlet的时间:" + new java.util.Date() + ". <br />");
        AsyncContext asyncContext = req.startAsync();
        asyncContext.addListener(new MyAsyncListener());
        asyncContext.setTimeout(60 * 1000) ;
        asyncContext.start(new GetBooksTarget(asyncContext));
        writer.println("结束Servlet的时间:" + new java.util.Date() + ". <br />");
        writer.flush();
    }
}
