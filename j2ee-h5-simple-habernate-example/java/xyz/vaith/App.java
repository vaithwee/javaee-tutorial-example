package xyz.vaith;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import xyz.vaith.model.Customer;
import xyz.vaith.utils.HibernateUtils;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        System.out.println("hello world");

        /*
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Customer customer = new Customer();
        customer.setCust_name("wee");
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
        */

        /*
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = new Customer();
        customer.setCust_name("Vaith");
        session.save(customer);
        transaction.commit();
        session.close();
        */

        /*
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = new Customer();
        customer.setCust_name("Hello World");
        Serializable id = session.save(customer);
        System.out.println(id);
        session.close();

        */

        /*
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class, 1l);
        System.out.println("print begin");
        System.out.println(customer);
        System.out.println("print end");

        Customer customer1 = session.get(Customer.class, 100l);
        System.out.println(customer1);

        */

        /*
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.load(Customer.class, 1l);
        System.out.println("print begin");
        System.out.println(customer);
        System.out.println("print end");

        Customer customer1 = session.load(Customer.class, 100l);
        System.out.println(customer1);
        */

        /*
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class, 1l);
        customer.setCust_level("高级");
        session.update(customer);
        transaction.commit();
        session.close();
        */

        /*
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class, 1l);
        session.delete(customer);
        transaction.commit();
        session.close();
        */

        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Customer");
        List<Customer> customers = query.list();
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        NativeQuery sqlQuery = session.createSQLQuery("select  * from cst_customer");
        List<Object[]> list = sqlQuery.list();
        for (Object[] objects : list) {
            System.out.println(Arrays.toString(objects));
        }

    }
}
