package xyz.vaith.controller;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class UploadController {

    @RequestMapping("/upload")
    public String upload(Model model, HttpServletRequest request, MultipartFile file) throws IOException {
        String path = request.getSession().getServletContext().getRealPath("/images/");
        File dir = new File(path);
        System.out.println(path);
        if (!dir.exists()) {
            dir.mkdir();
        }
        String filename = file.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace(" ", "").toLowerCase();
        filename = uuid + filename;
        file.transferTo(new File(path, filename));

        Configuration configuration = new Configuration(Zone.zone0());
        UploadManager uploadManager = new UploadManager(configuration);
        String accessKey = "";
        String secretKey = "";
        String bucket = "";

        String key = null;
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);



        try {
            Response response = uploadManager.put(path + filename, uuid, upToken);
            //解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            System.out.println("key ===" + putRet.key);
            System.out.println(putRet.hash);
            model.addAttribute("url", auth.privateDownloadUrl("url/" + putRet.key));
        } catch (QiniuException ex) {
            Response r = ex.response;
            System.out.println(r.toString());
            try {
                System.out.println(r.bodyString());
            } catch (QiniuException ex2) {
                //ignore
            }
        }

        return "success";
    }
}
