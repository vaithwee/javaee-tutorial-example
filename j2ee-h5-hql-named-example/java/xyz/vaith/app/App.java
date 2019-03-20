package xyz.vaith.app;

import org.hibernate.Session;
import org.hibernate.Transaction;
import xyz.vaith.app.domain.Person;
import xyz.vaith.app.util.HibernateUtil;

import java.util.List;

public class App {
    public static void main(String[] args){
        Session session = HibernateUtil.getCurrentSession();
        Transaction transaction = session.beginTransaction();
//        addPersonData(session);
        List resultList = session.getNamedQuery("myNamedQuery").setParameter("age", 10).getResultList();
        for (Object ele : resultList){
            System.out.println(ele);
        }
        transaction.commit();
    }

    private static void addPersonData(Session session) {
        for (int i = 0; i < 20; ++i) {
            Person person = new Person();
            person.setName("name" + i);
            person.setAge(i);
            session.save(person);
        }
    }
}
