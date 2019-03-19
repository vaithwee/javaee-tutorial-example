package xyz.vaith.app.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibetnateUtil {
    private static Configuration cfg;
    private static SessionFactory sf;
    static {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
    }

    public static Session getCurrentSession() {
        return sf.getCurrentSession();
    }
}
