package xyz.vaith.app;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import xyz.vaith.app.model.Person;
import xyz.vaith.app.util.HibernateUtil;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("hello world");

        Session session = HibernateUtil.getCurrentSession();
        Transaction transaction = session.beginTransaction();
//        for (int idx = 0; idx < 20; ++idx) {
//            Person person = new Person();
//            person.setName("wee" + idx);
//            person.setAge(idx);
//            session.save(person);
//        }

        Criteria criteria = session.createCriteria(Person.class);
        criteria.setFirstResult(3);
        criteria.setMaxResults(5);
        List<Person> list = criteria.list();

        for (Person p : list) {
            System.out.println(p);
        }
        transaction.commit();;

    }
}
