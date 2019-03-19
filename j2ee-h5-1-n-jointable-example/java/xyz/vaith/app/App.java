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
        /*
        Person person = new Person();
        person.setAge(28);
        person.setName("wee");
//        person.getAddresses().add(new Address("Beijing, China"));
//        person.getAddresses().add(new Address("Shanghai, China"));
        Address address = new Address("Fz");
        Address address1 = new Address("xm");
        address.setPerson(person);
        address1.setPerson(person);
        session.persist(address);
        session.persist(address1);
        */
        Person person = session.get(Person.class, 1);
        System.out.println(person);
        transaction.commit();
    }


}
