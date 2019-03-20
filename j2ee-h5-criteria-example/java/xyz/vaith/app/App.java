package xyz.vaith.app;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import xyz.vaith.app.domain.Enrolment;
import xyz.vaith.app.domain.Student;
import xyz.vaith.app.util.HibernateUtil;

import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        List list = session.createCriteria(Student.class).add(Restrictions.gt("name", "a")).list();
        System.out.println("简单条件查询");
        for (Object object : list){
            Student student = (Student)object;
            System.out.println(student.getName());
            Set<Enrolment> enrolments = student.getEnrolments();
            for (Enrolment enrolment : enrolments){
                System.out.println(enrolment.getCourse().getName());
            }
        }

        transaction.commit();
    }


}
