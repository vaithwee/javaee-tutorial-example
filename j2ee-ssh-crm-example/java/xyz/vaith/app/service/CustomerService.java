package xyz.vaith.app.service;

import org.hibernate.criterion.DetachedCriteria;
import xyz.vaith.app.domain.Customer;
import xyz.vaith.app.domain.PageBean;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    PageBean<Customer> findAllByPage(DetachedCriteria detachedCriteria, Integer pageIndex, Integer pageSize);

    Customer findCustomerById(Integer cid);

    void deleteCustomer(Customer customer);
}
