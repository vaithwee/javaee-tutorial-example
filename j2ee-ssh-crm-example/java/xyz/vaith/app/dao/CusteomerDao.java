package xyz.vaith.app.dao;

import org.hibernate.criterion.DetachedCriteria;
import xyz.vaith.app.domain.Customer;

import java.util.List;

public interface CusteomerDao {
    Customer save(Customer customer);
    Integer findCount(DetachedCriteria detachedCriteria);

    List<Customer> findByPage(DetachedCriteria detachedCriteria, Integer pageIndex, Integer pageSize);
}
