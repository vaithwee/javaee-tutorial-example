package xyz.vaith.app;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import xyz.vaith.app.domain.Person;
import xyz.vaith.app.util.HibetnateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class HqlQuery {
    public static void main(String[] args) throws Exception {
//        findPerson();

//        findPersonByHappendDate();
        Session session = HibetnateUtil.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        List<Object[]> list = session.createQuery("select distinct p.id , p.name, p.age from Person p join p.myEvents", Object[].class).getResultList();
        for (Object[] objects : list) {
            System.out.println(objects);
        }
        transaction.commit();
    }

    private static void findPersonByHappendDate() throws ParseException {
        Session session = HibetnateUtil.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start = dateFormat.parse("2015-01-01");
        List<Person> people = session.createQuery("select distinct p from Person p inner join p.myEvents event where event.happenDate between :startDate and :endDate", Person.class).setParameter("startDate", start).setParameter("endDate", new Date()).getResultList();
        for (Person p : people) {
            System.out.println(p);
        }
    }

    private static void findPerson() {
        Session session = HibetnateUtil.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        List<Person> people = session.createQuery("select distinct p from Person p join p.myEvents where title = :eventTitle", Person.class).setParameter("eventTitle", "event idx:9, jdx:0").getResultList();
        for (Person p : people) {
            System.out.println(p);
        }
        transaction.commit();


    }
}
