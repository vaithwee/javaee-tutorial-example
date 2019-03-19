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
        Session currentSession = sessionFactory.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();

        /*
        Person p1 = new Person();
        p1.setName("wee");
        p1.setAge(18);

        Person p2 = new Person();
        p2.setAge(29);
        p2.setName("Vaith");

        Address a1 = new Address();
        a1.setDetail("FZ");

        Address a2 = new Address();
        a2.setDetail("XM");

        p1.getAddresses().add(a1);
        p1.getAddresses().add(a2);

        p2.getAddresses().add(a2);
        currentSession.persist(p1);
        currentSession.persist(p2);
        */
        Address address = currentSession.get(Address.class, 2);
        System.out.println(address.getPeople());
        transaction.commit();
    }
}
