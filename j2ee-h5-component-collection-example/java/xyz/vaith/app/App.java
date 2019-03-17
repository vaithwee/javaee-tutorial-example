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
        Person person = new Person();
        person.setAge(28);
        Name name = new Name("Vaith", "Wee");
        name.getPower().put("W", 90);
        name.getPower().put("V", 12);
        person.setName(name);
        session.save(person);
        transaction.commit();
    }
}
