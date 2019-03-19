package xyz.vaith.app;

import org.hibernate.Session;
import org.hibernate.Transaction;
import xyz.vaith.app.domain.MyEvent;
import xyz.vaith.app.domain.Person;
import xyz.vaith.app.util.HibetnateUtil;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Session session = HibetnateUtil.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        for (int idx = 0; idx < 20; idx++) {
            Person person = new Person();
            person.setName("Wee" + idx);
            person.setAge(idx);
            person.getEmails().add("email:"+idx+"wee");
            session.save(person);
            for (int jdx = 0; jdx < 3; ++jdx) {
                MyEvent event = new MyEvent();
                event.setTitle("event idx:"+idx + ", jdx:" + jdx);
                event.setHappenDate(new Date());
                event.getActors().add(person);
                session.save(event);
                person.getMyEvents().add(event);
            }
        }
        transaction.commit();
    }
}
