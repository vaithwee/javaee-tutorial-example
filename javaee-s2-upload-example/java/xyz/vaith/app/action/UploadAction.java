package xyz.vaith.app.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class UploadAction extends ActionSupport {
    private String title;
    private String savePath;

    private File upload;
    private String uploadContentType;
    private String uploadFileName;


    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String allowTypes;

    public String getAllowTypes() {
        return allowTypes;
    }

    public void setAllowTypes(String allowTypes) {
        this.allowTypes = allowTypes;
    }

    @Override
    public String execute() throws Exception {
        String directory = ServletActionContext.getServletContext().getRealPath("");
        FileOutputStream fos = new FileOutputStream(directory + "/" + getUploadFileName());
        FileInputStream fis = new FileInputStream(getUpload());
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, len);
        }
        return SUCCESS;

    }

    public String filterTypes(String[] types) {
        String fileType = getUploadContentType();
        for (String type : types) {
            if (type.equals(fileType)) {
                return null;
            }
        }
        return ERROR;
    }

    @Override
    public void validate() {
        String filterResult = filterTypes(getAllowTypes().split(","));
        if (filterResult != null) {
            addFieldError("upload", "您要上传的文件类型不正确");
        }
    }
}
