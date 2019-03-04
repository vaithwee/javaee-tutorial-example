package xyz.vaith.app;

import org.hibernate.Session;
import org.hibernate.Transaction;
import xyz.vaith.app.model.AssignedPerson;
import xyz.vaith.app.model.IncrementPerson;
import xyz.vaith.app.model.NativePerson;
import xyz.vaith.app.model.UUIDPerson;
import xyz.vaith.app.util.HibernateUtils;

public class App {
    public static void main(String[] args){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();


        IncrementPerson ip = new IncrementPerson();
        ip.setName("wee");
        ip.setAge(28);
        session.save(ip);



        NativePerson np = new NativePerson();
        np.setName("wee");
        np.setAge(28);
        session.save(np);

        UUIDPerson up = new UUIDPerson();
        up.setAge(28);
        up.setName("wee");
        session.save(up);

        AssignedPerson ap = new AssignedPerson();
        ap.setId(1l);
        ap.setNamel("wee");
        ap.setAge(28);
        session.save(ap);


        transaction.commit();
        session.close();

    }
}
