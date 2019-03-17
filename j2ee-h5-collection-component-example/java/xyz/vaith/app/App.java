package xyz.vaith.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import xyz.vaith.app.domain.Name;
import xyz.vaith.app.domain.Person;
import xyz.vaith.app.domain.Score;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Person person = new Person();
        person.setAge(30);
        person.getNicks().add(new Name("Vaith", "Wee"));
        person.getNicks().add(new Name("Hello", "World"));
        person.getScores().put("数学", new Score("优秀", 97f));
        person.getScores().put("语文", new Score("良好", 86f));
        session.save(person);
        transaction.commit();
    }
}
