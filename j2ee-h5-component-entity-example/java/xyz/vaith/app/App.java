package xyz.vaith.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import xyz.vaith.app.domain.Address;
import xyz.vaith.app.domain.Person;
import xyz.vaith.app.domain.School;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Person person = new Person();
        person.setAge(28);
        person.setName("Wee");
        session.save(person);
        Address address = new Address();
        address.setAddressDetail("Beijing, China");
        person.setAddress(address);
        School s1 = new School();
        s1.setName("Beijing DX");
        School s2 = new School();
        s2.setName("QHDX");
        address.getSchools().add(s1);
        address.getSchools().add(s2);
        transaction.commit();
    }
}
