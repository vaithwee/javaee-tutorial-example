package xyz.vaith.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ReadListener;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class AsyncIOServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter writer = resp.getWriter();
        writer.println("<title>非阻塞IO示例</title>");
        writer.println("进入servlet的时间:" + new Date() + "<br />");
        AsyncContext asyncContext = req.getAsyncContext();
        asyncContext.setTimeout(60 * 1000);
        ServletInputStream inputStream = req.getInputStream();
        inputStream.setReadListener(new ReadListener() {
            @Override
            public void onDataAvailable() throws IOException {
                System.out.println("数据可用");
                try {
                    Thread.sleep(5000);
                    StringBuffer sb = new StringBuffer();
                    int len = -1;
                    byte[] buff = new byte[1024];
                    while (inputStream.isReady() && (len = inputStream.read(buff)) > 0) {
                        String data = new String(buff, 0, len);
                        sb.append(data);
                    }
                    System.out.println(sb);
                    asyncContext.getRequest().setAttribute("info", sb.toString());
                    asyncContext.dispatch("/async.jsp");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onAllDataRead() throws IOException {
                System.out.println("数据读取完成");
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }
        });
        writer.println("结束servlet的时间:"+ new Date());
        writer.flush();

    }
}
