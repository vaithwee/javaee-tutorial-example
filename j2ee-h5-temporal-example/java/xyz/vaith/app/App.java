package xyz.vaith.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import xyz.vaith.app.domain.Person;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Person p = new Person();
        p.setName("wee");
        p.setBirth(new Date());
        session.save(p);
        transaction.commit();
    }
}
