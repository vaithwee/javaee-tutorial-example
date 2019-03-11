package xyz.vaith.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import xyz.vaith.app.domain.News;

public class App {
    public static void main(String[] args) {
        System.out.println("hello world");
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session currentSession = sessionFactory.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        News news = new News();
        news.setTitle("wee研究中心");
        news.setContent("我是暂时性的内容");
        currentSession.save(news);
        transaction.commit();

    }
}
