package xyz.vaith.app;

import org.hibernate.Session;
import org.hibernate.Transaction;
import xyz.vaith.app.model.AutoUpadatePerson;
import xyz.vaith.app.util.HibernateUtil;

public class App {
    public static void main(String[] args) {
//        AutoUpadatePerson person = new AutoUpadatePerson();
//        person.setAge(28);
//        person.setName("wee");

        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
//        session.save(person);

        AutoUpadatePerson person = session.get(AutoUpadatePerson.class, 1l);

        person.setName("Vaith11");
        transaction.commit();

        session.close();
    }
}
