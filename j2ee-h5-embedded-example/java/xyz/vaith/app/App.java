package xyz.vaith.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import xyz.vaith.app.domain.Name;
import xyz.vaith.app.domain.Person;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
//        Person person = new Person();
//        person.setName(new Name("Vaith", "Wee"));
//        person.setAge(28);
//        session.save(person);

        Person person = session.get(Person.class, 1);
        System.out.println(person);
        transaction.commit();
    }
}
