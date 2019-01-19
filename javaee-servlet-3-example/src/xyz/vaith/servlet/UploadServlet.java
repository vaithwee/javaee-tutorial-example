package xyz.vaith.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("utf-8");

        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        PrintWriter writer = resp.getWriter();
        writer.println("普通的name参数为:" + name + "<br />");
        Part part = req.getPart("file");
        writer.println("上传的文件类型为:" + part.getContentType() + "<br />");
        writer.println("上传的文件大小为:" + part.getSize() + "<br />");
        Collection<String> headerNames = part.getHeaderNames();
        for (String headerName : headerNames) {
            writer.println(headerName + ": " + part.getHeader(headerName) + "<br />");
        }
        String fileNameInfo = part.getHeader("content-disposition");
        String filename = fileNameInfo.substring(fileNameInfo.indexOf("filename=\"") + 10, fileNameInfo.length() - 1);
        part.write(getServletContext().getRealPath("/uploadFiles") + "/" + filename);
    }
}
