package xyz.vaith.app.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import xyz.vaith.app.dao.CustomerDao;
import xyz.vaith.app.domain.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
    @Override
    public void save(Customer customer) {
        System.out.println("dao save executing");
        this.getHibernateTemplate().save(customer);
    }
}
