package xyz.vaith.app.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.hibernate.criterion.DetachedCriteria;
import xyz.vaith.app.domain.Customer;
import xyz.vaith.app.domain.LinkMan;
import xyz.vaith.app.domain.PageBean;
import xyz.vaith.app.service.CustomerService;
import xyz.vaith.app.service.LinkManService;

import java.util.List;

public class LinkManAction extends ActionSupport implements ModelDriven<LinkMan> {
    private LinkMan linkMan = new LinkMan();

    private Integer pageIndex;
    private Integer pageSize;
    private LinkManService linkManService;
    private CustomerService customerService;


    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
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

    @Override
    public LinkMan getModel() {
        return this.linkMan;
    }

    public void setLinkManService(LinkManService linkManService) {
        this.linkManService = linkManService;
    }


    public String list() throws Exception {
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(LinkMan.class);
        PageBean<LinkMan> linkMans = linkManService.findAllByPage(detachedCriteria, getPageIndex(), getPageSize());
        ActionContext.getContext().getValueStack().push(linkMans);
        System.out.println(linkMans.getList());
        return SUCCESS;
    }

    public String addUI() {
        List<Customer> allCustomer = customerService.findAllCustomer();
        ActionContext.getContext().getValueStack().set("list", allCustomer);
        return SUCCESS;
    }

    public String save() {
        this.linkManService.save(linkMan);
        return SUCCESS;
    }

    public String editUI() {
        List<Customer> allCustomer = customerService.findAllCustomer();
        ActionContext.getContext().getValueStack().set("list", allCustomer);
        linkMan = this.linkManService.getLinkManById(linkMan.getLid());
        ActionContext.getContext().getValueStack().push(linkMan);
        return SUCCESS;
    }

    public String update() {
        this.linkManService.update(linkMan);
        return SUCCESS;
    }

    public String delete() {
        this.linkManService.delete(linkMan);
        return SUCCESS;
    }
}
