package xyz.vaith.app.service.impl;

import org.hibernate.criterion.DetachedCriteria;
import xyz.vaith.app.dao.CusteomerDao;
import xyz.vaith.app.dao.UserDao;
import xyz.vaith.app.domain.Customer;
import xyz.vaith.app.domain.PageBean;
import xyz.vaith.app.service.CustomerService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class CustomerServiceImpl implements CustomerService {
    private CusteomerDao custeomerDao;

    public void setCusteomerDao(CusteomerDao custeomerDao) {
        this.custeomerDao = custeomerDao;
    }

    @Override
    public Customer save(Customer customer) {
        return this.custeomerDao.save(customer);
    }

    @Override
    public PageBean<Customer> findAllByPage(DetachedCriteria detachedCriteria, Integer pageIndex, Integer pageSize) {
        PageBean pageBean = new PageBean();
        pageBean.setPageIndex(pageIndex);
        pageBean.setPageSize(pageSize);
        Integer count = custeomerDao.findCount(detachedCriteria);
        pageBean.setTotalCount(count);
        pageBean.setTotalPage((int) Math.ceil(count.doubleValue() / pageSize));
        Integer begin = pageIndex * pageSize;
        List<Customer> list = custeomerDao.findByPage(detachedCriteria, pageIndex, pageSize);
        pageBean.setList(list);
        return pageBean;
    }

    @Override
    public Customer findCustomerById(Integer cid) {
        return custeomerDao.findCustomerById(cid);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        custeomerDao.deleteCuctomer(customer);
    }
}
