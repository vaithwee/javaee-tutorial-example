package xyz.vaith.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import sun.reflect.misc.FieldUtil;
import xyz.vaith.domain.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;

@Controller
public class FileController {
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(HttpServletRequest request, @RequestParam("description") String desc, @RequestParam("file") MultipartFile file) throws Exception {
        if (!file.isEmpty()) {
            String path = request.getServletContext().getRealPath("/images/");
            String fileName = file.getOriginalFilename();
            File dir = new File(path);
            if (!dir.exists()) {
                dir.mkdir();
            }
            File filePath = new File(path, fileName);
            file.transferTo(filePath);
            return "success";
        }
        return "error";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String regeister(HttpServletRequest request, @ModelAttribute User user, Model model) throws Exception {
        System.out.println(user.getUsername());
        if (!user.getImage().isEmpty()) {
            String path = request.getServletContext().getRealPath("/images/");
            String fileName = user.getImage().getOriginalFilename();
            File dir = new File(path);
            if (!dir.exists()) {
                dir.mkdir();
            }
            File filePath = new File(path, fileName);
            user.getImage().transferTo(filePath);
            model.addAttribute("user", user);
            return "userinfo";
        }
        return "error";
    }


    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public ResponseEntity<byte[]> download(HttpServletRequest request, @RequestParam("filename") String filename, Model model) throws Exception {
        String path = request.getServletContext().getRealPath("/images/");
        File file = new File(path, filename);
        HttpHeaders headers = new HttpHeaders();
        String downloadFileName = new String(filename.getBytes("UTF-8"), "iso-8859-1");
        headers.setContentDispositionFormData("attachment", downloadFileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(String username, String password, HttpSession session, ModelAndView mv) {
        if (username != null && username.equals("wee") && password != null && password.equals("123")) {
            User user = new User();
            user.setUsername("wee");
            session.setAttribute("user", user);
            mv.setViewName("redirect:main");

        } else  {
            mv.addObject("message", "登录名或者密码错误");
            mv.setViewName("loginForm");
        }
        return mv;
    }

}
