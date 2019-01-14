package xyz.vaith.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.*;

public class ConfigServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        resp.setCharacterEncoding("utf-8");
        try {
            ServletConfig config = getServletConfig();
            String driver = config.getInitParameter("driver");
            String url = config.getInitParameter("url");
            String user = config.getInitParameter("user");
            String pwd = config.getInitParameter("pwd");

            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, user, pwd);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select  * from news_inf");

            PrintWriter out = resp.getWriter();

            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>访问Servlet初始化参数测试</title>");

            out.println("</head>");
            out.println("<body>");
            out.println("<table bgcolor='#9999dd' border='1' width='200'>");
            while (resultSet.next()) {
                out.println("<tr>");
                out.println("<td>");
                out.println(resultSet.getInt("id"));
                out.println("</td>");
                out.println("<td>");
                out.println(resultSet.getString("content"));
                out.println("</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
