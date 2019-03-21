package xyz.vaith.app;

public class UserDaoJdbcImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDaoJdbcImpl Executing");
    }
}
