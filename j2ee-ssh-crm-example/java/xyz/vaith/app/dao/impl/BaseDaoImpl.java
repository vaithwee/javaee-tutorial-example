package xyz.vaith.app.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import xyz.vaith.app.dao.BaseDao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {

    private Class clazz;
    public BaseDaoImpl() {
        Class clazz = this.getClass();
        Type type = clazz.getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType)type;
        Type[] arguments = parameterizedType.getActualTypeArguments();
        this.clazz = (Class)arguments[0];
    }

    @Override
    public void save(T t) {
        this.getHibernateTemplate().save(t);
    }

    @Override
    public void update(T t) {
        this.getHibernateTemplate().update(t);
    }

    @Override
    public void delete(T t) {
        this.getHibernateTemplate().delete(t);
    }

    @Override
    public T findCustomerById(Serializable id) {
        return (T) this.getHibernateTemplate().load(this.clazz, id);
    }

    @Override
    public List<T> findAll() {
        return this.getHibernateTemplate().loadAll(this.clazz);
    }

    @Override
    public Integer findCount(DetachedCriteria detachedCriteria) {
        detachedCriteria.setProjection(Projections.rowCount());
        List<Long> list = (List<Long>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
        if (list.size() > 0) {
           return list.get(0).intValue();
        }
        return null;
    }

    @Override
    public List<T> findByPage(DetachedCriteria detachedCriteria, Integer pageIndex, Integer pageSize) {
        detachedCriteria.setProjection(null);
        return (List<T>) this.getHibernateTemplate().findByCriteria(detachedCriteria, pageIndex * pageSize, pageSize);
    }
}
