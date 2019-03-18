package xyz.vaith.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import xyz.vaith.app.domain.Address;
import xyz.vaith.app.domain.Person;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Person person = new Person();
        Address a = new Address("Beijing, China");
        session.persist(a);
        person.setName("Wee");
        person.setAge(28);
        person.getAddresses().add(a);
        session.save(person);
        Address a2 = new Address("Shanghai, China");
        session.persist(a2);
        person.getAddresses().add(a2);
        transaction.commit();
    }
}
