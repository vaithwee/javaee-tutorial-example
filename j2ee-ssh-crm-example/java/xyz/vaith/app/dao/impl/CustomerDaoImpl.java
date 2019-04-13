package xyz.vaith.app.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import xyz.vaith.app.dao.CusteomerDao;
import xyz.vaith.app.domain.Customer;

import java.io.Serializable;
import java.util.List;

public class CustomerDaoImpl extends HibernateDaoSupport implements CusteomerDao {
    @Override
    public Customer save(Customer customer) {
        Serializable id =this.getHibernateTemplate().save(customer);
       return this.getHibernateTemplate().get(Customer.class, id);
    }

    @Override
    public Integer findCount(DetachedCriteria detachedCriteria) {
        detachedCriteria.setProjection(Projections.rowCount());
        List<Long> list = (List<Long>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
        if (list.size() > 0){
            return list.get(0).intValue();
        }
        return 0;
    }

    @Override
    public List<Customer> findByPage(DetachedCriteria detachedCriteria, Integer pageIndex, Integer pageSize) {
        detachedCriteria.setProjection(null);
        List<Customer> list = (List<Customer>) this.getHibernateTemplate().findByCriteria(detachedCriteria, pageIndex*pageSize, pageSize);
        return list;
    }
}
