package xyz.vaith.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/upload")
public class UploadController {
    @RequestMapping("/method1")
    public String method1(HttpServletRequest request) throws Exception {
        System.out.println("method 1 executing");
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdir();
        }



        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        List<FileItem> items = upload.parseRequest(request);
        for (FileItem item : items) {
            if (item.isFormField()) {

            } else {
                String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
                String filename = item.getName();
                filename = uuid + filename;
                item.write(new File(path, filename));
                item.delete();
            }
        }
        return "success";
    }

    @RequestMapping("/method2")
    public String method2(HttpServletRequest request, MultipartFile file) throws IOException {
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdir();
        }
        String filename = file.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        filename = uuid + filename;
        file.transferTo(new File(path, filename));

        return "success";
    }

//    @RequestMapping("/method3")
//    public String method3(MultipartFile file) throws IOException {
//
//    }
}
