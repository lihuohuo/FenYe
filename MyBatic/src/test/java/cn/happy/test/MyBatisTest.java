package cn.happy.test;

import cn.happy.dao.IUserDao;
import cn.happy.entity.UserInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by lenovo on 2017/6/30.
 */
public class MyBatisTest {
//    04.修改

    @Test
    public void modify() throws IOException {
        String path="MyBatis-config.xml";
        InputStream is= Resources.getResourceAsStream(path);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session =factory.openSession();
        IUserDao dao =session.getMapper(IUserDao.class);
        UserInfo userInfo = new UserInfo();
        userInfo.setName("火火");
        userInfo.setId(1);
        int count =dao.modify(userInfo);
        System.out.println(count);
        session.commit();
        System.out.println(count);

    }


//05. 删除
    @Test
    public  void deleteUser() throws IOException {
        String path="MyBatis-config.xml";
        InputStream is= Resources.getResourceAsStream(path);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session =factory.openSession();
        IUserDao dao =session.getMapper(IUserDao.class);
        dao.deleteUser(6);
        session.commit();
        session.close();

    }

    //03.添加
    @Test
    public void addlist() throws Exception{
        String path = "MyBatis-config.xml";


           InputStream is = Resources.getResourceAsStream(path);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            SqlSession session = factory.openSession();

            IUserDao dao = session.getMapper(IUserDao.class);
            UserInfo u=new UserInfo();
            u.setName("123");

            int count = dao.addlist(u);
        System.out.println(count);
            session.commit();
            System.out.println(count);

        }






    //02.带条件查询  resultMap的使用
    @Test
    public void testgetOneUserResultMap() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        String path = "MyBatis-config.xml";
        try {
            InputStream is = Resources.getResourceAsStream(path);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            SqlSession session = factory.openSession();

            IUserDao dao = session.getMapper(IUserDao.class);
            UserInfo userInfo = dao.getgetDeptResultMapById(3);
            System.out.println(userInfo.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //02.带条件查询   Mapper的使用
    @Test
    public void testgetOneUser() {
        System.out.println("********************");
        String path = "MyBatis-config.xml";
        try {
            InputStream is = Resources.getResourceAsStream(path);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            SqlSession session = factory.openSession();
            IUserDao dao = session.getMapper(IUserDao.class);
            UserInfo userInfo = dao.getIdList(2);
            System.out.println(userInfo.getName());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //02.查询所有  使用getMapper()
    @Test
    public void testgetMapper() {
        System.out.println("---------------------------");
        String path = "MyBatis-config.xml";
        try {
            InputStream is = Resources.getResourceAsStream(path);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            SqlSession session = factory.openSession();
            IUserDao dao = session.getMapper(IUserDao.class);

            List<UserInfo> list = dao.getAllList();
            for (UserInfo userInfo : list) {
                System.out.println(userInfo.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //01.查询所有
    @Test
    public void testall() {
        String path = "MyBatis-config.xml";
        try {
            InputStream is = Resources.getResourceAsStream(path);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            SqlSession session = factory.openSession();

            List<UserInfo> list = session.selectList("cn.happy.dao.IUserDao.getAllList");
            for (UserInfo userInfo : list) {

                System.out.println(userInfo.getName());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}



