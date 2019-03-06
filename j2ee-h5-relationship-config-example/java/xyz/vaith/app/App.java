package xyz.vaith.app;

import org.hibernate.Session;
import org.hibernate.Transaction;
import xyz.vaith.app.model.Dog;
import xyz.vaith.app.model.Person;
import xyz.vaith.app.util.HibernateUtil;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog.setName("汤姆");
        dog.setAge(3);

        dog2.setName("汤圆");
        dog2.setAge(2);

        dog1.setName("挂画");
        dog1.setAge(3);

        Person person = new Person();
//        Person person1 = new Person();
        person.setName("男主");
        person.setAge(28);

//        person1.setName("女主");
//        person1.setAge(30);
        person.getDogs().add(dog);
        person.getDogs().add(dog1);
//        person1.getDogs().add(dog2);
        dog2.setMaster(person);

        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
//        session.save(dog);
//        session.save(dog1);
//        session.save(dog2);
        session.save(person);
//        session.save(person1);
        transaction.commit();
    }
}
