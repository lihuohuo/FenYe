package cn.happy.entity;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

import java.io.InputStream;

import java.util.List;

/**
 * Created by lenovo on 2017/6/29.
 */
public class UserInfoTest {



        public static void main(String[] args)throws Exception {
       /*   String resource= "MyBatis-config.xml";
          InputStream inputStream = Resources.getResourceAsStream(resource);*/



            String resource="MyBatis-config.xml";
            InputStream inputStream= Resources.getResourceAsStream(resource);
            //获得会话工厂
            SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(inputStream);
            //会话
            SqlSession session=sf.openSession();
            //通过命名空间唯一锁定要执行的sql
            List<UserInfo> list=session.selectList("cn.happy.dao.selectAll");
            for(UserInfo item:list){
                System.out.println(item.getName()+item.getId());
            }
            session.close();
        }

    }

