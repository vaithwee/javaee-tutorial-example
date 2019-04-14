package xyz.vaith.app.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.aspectj.util.FileUtil;
import org.hibernate.criterion.DetachedCriteria;
import xyz.vaith.app.domain.Customer;
import xyz.vaith.app.domain.PageBean;
import xyz.vaith.app.service.CustomerService;
import xyz.vaith.app.util.UploadUtils;

import java.io.File;
import java.io.IOException;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
    private CustomerService customerService;
    private Integer pageIndex;
    private Integer pageSize;
    private File upload;
    private String uploadFileName;
    private String uploadContentType;

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageIndex() {
        if (pageIndex==null) {
            return 0;
        }
        return pageIndex;
    }

    public Integer getPageSize() {
        if (pageSize==null || pageSize==0){
            return 3;
        }
        return pageSize;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    private Customer customer = new Customer();
    @Override
    public Customer getModel() {
        return customer;
    }


    public String add() throws IOException {
        if (upload!=null) {
            String directory = ServletActionContext.getServletContext().getRealPath("images");
            String filename = UploadUtils.getUUIDFileName(uploadFileName);
            String path = UploadUtils.getPath(filename);
            String url = directory + path;
            File file = new File(url);
            if (!file.exists()) {
                file.mkdirs();
            }
            File dict = new File(url + "/" + filename);
            FileUtil.copyFile(upload, dict);
            this.customer.setImage("images" + path + "/" + filename);
        }
        Customer customer = customerService.save(this.customer);
        return SUCCESS;
    }

    public String listUI() {
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Customer.class);
        PageBean<Customer> allByPage = customerService.findAllByPage(detachedCriteria, getPageIndex(), getPageSize());
        ActionContext.getContext().getValueStack().push(allByPage);
//        System.out.println(allByPage);
        return SUCCESS;
    }

    public String delete() {
        Customer c = customerService.findCustomerById(this.customer.getCid());
        if (c!=null) {
            File file = new File(ServletActionContext.getServletContext().getRealPath("") + c.getImage());
            if (file.exists()) {
                file.delete();
            }
        }
        customerService.deleteCustomer(c);
        return SUCCESS;
    }
}
