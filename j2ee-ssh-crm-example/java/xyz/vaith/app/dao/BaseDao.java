package xyz.vaith.app.dao;

import org.hibernate.criterion.DetachedCriteria;
import java.io.Serializable;
import java.util.List;

public interface BaseDao <T> {
    void save(T t);
    void update(T t);
    void delete(T t);
    T findCustomerById(Serializable id);
    List<T> findAll();
    Integer findCount(DetachedCriteria detachedCriteria);
    List<T> findByPage(DetachedCriteria detachedCriteria, Integer pageIndex, Integer pageSize);
}
