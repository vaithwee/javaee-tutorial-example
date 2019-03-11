package xyz.vaith.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import xyz.vaith.app.domain.News;
import xyz.vaith.app.domain.Season;

public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        News news = new News();
        news.setTitle("hello");
        news.setContent("world");
        news.setHappenSeason(Season.秋季);
        session.save(news);
        transaction.commit();
    }
}
