package xyz.vaith;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import xyz.vaith.domain.User;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    @org.junit.jupiter.api.Test
    public void test1() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        User user = new User("admin", "男", 18);
        session.insert("xyz.vaith.mapper.UserMapper.save", user);
        session.commit();
        session.close();

    }
}
