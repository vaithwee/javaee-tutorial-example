package xyz.vaith.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

@WebServlet(name = "firstServlet", urlPatterns = {"/firstServlet"})
public class FirstServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        resp.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        String gender = req.getParameter("gender");
        String[] color = req.getParameterValues("color");
        String national = req.getParameter("country");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Servlet测试</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("您的名字:" + name + "<hr />");
        out.println("您的性别:" + gender  + "<hr />");
        out.println("您喜欢的颜色:");
        for (String c : color) {
            out.println(c  +  " ");
        }
        out.println("<hr />");
        out.println("您来自的国家:" + national + "<hr />");
        out.println("</body>");
        out.println("</html>");
    }
}
