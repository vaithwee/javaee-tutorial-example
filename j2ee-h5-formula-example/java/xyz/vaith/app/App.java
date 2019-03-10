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
        SessionFactory sf = cfg.buildSessionFactory();
        Session currentSession = sf.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
//        News news = new News();
//        news.setTitle("wee技术研究所");
//        news.setContent("wee技术研究所成立了");
//        currentSession.save(news);
        News news = (News)currentSession.get(News.class, 1);
        System.out.println(news.getFullContent());

        transaction.commit();
        currentSession.close();
    }
}
