package cn.happy.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by guo on 2017/7/12.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        InputStream stream = Resources.getResourceAsStream("MyBatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession session = factory.openSession();
        IUserDao dao = session.getMapper(IUserDao.class);
/*        User u=new User();
        u.setUserName("1");
        u.setUserPassword("1");
        int login = dao.Login(u);
        System.out.println(login);*/
    }
}
