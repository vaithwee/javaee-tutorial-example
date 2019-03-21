package xyz.vaith.app;

public class UserDaoHibernateImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDaoHibernateImpl Executing");
    }
}
