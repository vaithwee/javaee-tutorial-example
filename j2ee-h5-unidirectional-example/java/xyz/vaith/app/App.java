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
        Person person = new Person();
        Address address = new Address("中国北京");
        person.setName("Wee");
        person.setAge(21);
        person.setAddress(address);
        currentSession.persist(person);
        Address address1 = new Address("中国上海");
        person.setAddress(address1);
        transaction.commit();

    }
}
