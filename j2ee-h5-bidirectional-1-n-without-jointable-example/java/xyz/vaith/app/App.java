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
        Person person = session.get(Person.class, 1);
        System.out.println(person);
        /*
        Person p = new Person();
        p.setName("wee");
        p.setAge(29);
        session.save(p);
        Address address = new Address();
        address.setDetail("Beijing, China");
        address.setPerson(p);
        session.persist(address);

        Address address1 = new Address();
        address1.setDetail("Shanghai, China");
        address1.setPerson(p);
        session.persist(address1);
        */
        transaction.commit();
    }
}
