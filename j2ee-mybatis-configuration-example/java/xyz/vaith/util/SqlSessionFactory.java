package xyz.vaith.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class SqlSessionFactory {
    private static org.apache.ibatis.session.SqlSessionFactory sqlSessionFactory;
    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }

    public static org.apache.ibatis.session.SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
