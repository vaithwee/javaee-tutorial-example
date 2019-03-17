package xyz.vaith.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import xyz.vaith.app.domain.Person;

public class APP {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session currentSession = sessionFactory.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
//        Person p = new Person();
//        p.setName("wee");
//        p.setAge(12);
//        p.setSchools(new String[]{"小学", "中学"});
//        currentSession.save(p);

        Person person = currentSession.get(Person.class, 1);
        System.out.println(person);
        transaction.commit();
    }
}
