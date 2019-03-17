package xyz.vaith.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import xyz.vaith.app.domain.Person;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session currentSession = sessionFactory.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
//        Person person = new Person();
//        person.setAge(20);
//        person.setName("wee");
//        person.getSchools().add("小学");
//        person.getSchools().add("中学");
//        currentSession.save(person);
//        transaction.commit();


        Person person = currentSession.get(Person.class, 1);
        System.out.println(person);
        transaction.commit();

    }
}
