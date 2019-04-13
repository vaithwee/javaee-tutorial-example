package xyz.vaith.app.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import xyz.vaith.app.dao.UserDao;
import xyz.vaith.app.domain.User;

import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    @Override
    public void save(User user) {
        this.getHibernateTemplate().save(user);
    }

    @Override
    public User login(User user) {
        List<User> list = (List<User>) this.getHibernateTemplate().findByExample(user);
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
