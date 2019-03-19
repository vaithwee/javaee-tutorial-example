package xyz.vaith.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import xyz.vaith.app.domain.*;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Person person = new Person();
        person.setName("Wee");
        person.setGender('男');
        session.save(person);

        Employee e1 = new Employee();
        e1.setName("朱");
        e1.setTitle("项目组长");
        e1.setGender('男');
        e1.setSalary(5000);
        e1.setAddress(new Address("广州", "523034", "中国"));

        Employee e2 = new Employee();
        e2.setName("张美丽");
        e2.setTitle("项目分析");
        e2.setGender('女');
        e2.setSalary(5500);
        e2.setAddress(new Address("广州", "523034", "中国"));

        Manager manager = new Manager();
        manager.setName("Grace");
        manager.setTitle("项目经理");
        manager.setGender('女');
        manager.setSalary(12000);
        manager.setAddress(new Address("加州", "125421", "中国"));
        manager.setDepartment("研发部");
        e2.setManager(manager);

        Customer customer = new Customer();
        customer.setName("老何");
        customer.setGender('男');
        customer.setAddress(new Address("湖南", "233034", "中国"));
        customer.setComments("喜欢购物");
        customer.setEmployee(manager);

        session.save(manager);
        session.save(e1);
        session.save(e2);
        session.save(customer);



        transaction.commit();
    }
}
