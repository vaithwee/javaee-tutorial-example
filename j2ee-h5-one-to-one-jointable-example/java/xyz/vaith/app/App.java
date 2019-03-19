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
        person.setAge(20);
        person.setName("Wee");
        Address address = new Address();
        address.setDetail("Beijing, China");
        address.setPerson(person);
        session.save(address);
        transaction.commit();
    }
}
