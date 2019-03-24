package xyz.vaith.app.service.impl;

import xyz.vaith.app.dao.CustomerDao;
import xyz.vaith.app.domain.Customer;
import xyz.vaith.app.service.CustomerService;

import javax.transaction.Transactional;

@Transactional
public class CustomerServiceImpl implements CustomerService {
    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void save(Customer customer) {
        System.out.println("service save executing");
        customerDao.save(customer);
    }
}
