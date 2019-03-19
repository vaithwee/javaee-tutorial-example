package xyz.vaith.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import xyz.vaith.app.domain.User;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        for (int i=0; i<10000; ++i) {
            User user = new User();
            user.setName("name" + i);
            user.setAge(i);
            session.save(user);
            if (i%20==0) {
                session.flush();
                session.clear();
            }
        }
        transaction.commit();
    }
}
