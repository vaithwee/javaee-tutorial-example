package xyz.vaith.app.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.hibernate.criterion.DetachedCriteria;
import xyz.vaith.app.domain.Customer;
import xyz.vaith.app.domain.PageBean;
import xyz.vaith.app.service.CustomerService;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
    private CustomerService customerService;
    private Integer pageIndex;
    private Integer pageSize;


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


    public String add() {
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
}
