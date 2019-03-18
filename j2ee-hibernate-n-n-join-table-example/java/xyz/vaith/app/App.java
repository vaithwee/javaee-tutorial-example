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
        Person person1 = new Person();
        person1.setName("wee");
        person1.setAge(18);
        Person person2 = new Person();
        person2.setName("Vaith");
        person2.setAge(20);
        Address a1 = new Address("Beijing, China");
        Address a2 = new Address("Shanghai, China");
        person1.getAddresses().add(a1);
        person1.getAddresses().add(a2);
        person2.getAddresses().add(a2);
        person2.getAddresses().add(a1);
        currentSession.persist(person1);
        currentSession.persist(person2);
        transaction.commit();
    }
}
