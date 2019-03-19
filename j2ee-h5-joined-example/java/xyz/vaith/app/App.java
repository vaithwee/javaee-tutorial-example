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
        person.setGender('N');
        person.setAddress(new Address("北京", "100001", "中国"));
        session.save(person);

        Employee employee = new Employee();
        employee.setTitle("售货员");
        employee.setSalary(3000d);
        employee.setName("Tom");
        employee.setGender('N');

        Manager manager = new Manager();
        manager.setName("Haha");
        manager.setDepartment("销售部");
        manager.setTitle("销售总监");
        manager.setSalary(10000d);
        employee.setManager(manager);
        manager.getEmployees().add(employee);

        Customer customer = new Customer();
        customer.setName("Gray");
        customer.setGender('F');
        customer.setEmployee(manager);
        customer.setAddress(new Address("上海", "300001", "中国"));

        session.save(manager);
        session.save(employee);
        session.save(customer);



        transaction.commit();

    }
}
