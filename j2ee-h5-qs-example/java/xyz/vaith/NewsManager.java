package xyz.vaith;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import xyz.vaith.app.domain.News;

public class NewsManager {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        News news = new News();
        news.setTitle("wee研究中心成立了");
        news.setContent("wee研究中心成立, 网站地址:http://www.vaith.xyz");
        session.save(news);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
