package xyz.vaith.app.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import xyz.vaith.app.dao.UserDao;
import xyz.vaith.app.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    @Override
    public void save(User user) {
        this.getHibernateTemplate().save(user);
    }
}
