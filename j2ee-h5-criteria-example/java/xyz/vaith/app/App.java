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

//        simpleCriteriaQuery(session);

        List list = session.createCriteria(Student.class).add(Restrictions.gt("studentNumber", 20050231)).createCriteria("enrolments").add(Restrictions.gt("semester", 2)).list();
        for (Object object : list) {
            Student student = (Student) object;
            System.out.println("Student Name: " + student.getName());
            Set<Enrolment> enrolments = student.getEnrolments();
            for (Enrolment e : enrolments){
                System.out.println(e.getCourse().getName());
            }
        }

        transaction.commit();
    }

    private static void simpleCriteriaQuery(Session session) {
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
    }


}
