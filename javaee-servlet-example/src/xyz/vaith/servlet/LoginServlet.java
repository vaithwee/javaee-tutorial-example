package xyz.vaith.servlet;

import xyz.vaith.dao.DbDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;

public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String err = "";
        RequestDispatcher rd;
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        DbDao dao = new DbDao("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/javaee", "root", "abcd1234");
        try {
            ResultSet resultSet = dao.query("select * from user_inf where username = ? and password = ?", username, password);
            if (resultSet.next()) {
                HttpSession session = req.getSession();
                session.setAttribute("username", username);
                rd = req.getRequestDispatcher("/index.jsp");
                rd.forward(req, resp);
            } else  {
                err = "用户名或者密码错误";
            }
        } catch (Exception e) {
            e.printStackTrace();
            err = "用户名或者密码错误";
        }

        if (err != null && !err.equals("")) {
            rd = req.getRequestDispatcher("/login.jsp");
            req.setAttribute("err", err);
            rd.forward(req, resp);
        }
    }
}
