package xyz.vaith.app.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import xyz.vaith.app.domain.Customer;
import xyz.vaith.app.service.CustomerService;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
    private CustomerService customerService;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    private Customer customer = new Customer();
    @Override
    public Customer getModel() {
        return customer;
    }


}
