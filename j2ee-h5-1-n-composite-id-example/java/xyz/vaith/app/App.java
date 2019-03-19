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
        person.setAge(28);
        person.setFirst("Vaith");
        person.setLast("Wee");

        Address a1 = new Address();
        a1.setAddressDetail("Beijing, China");

        Address a2 = new Address();
        a2.setAddressDetail("Shanghai, China");

        person.getAddresses().add(a1);
        person.getAddresses().add(a2);
        session.save(a1);
        session.save(a2);
        session.save(person);
        transaction.commit();
    }
}
