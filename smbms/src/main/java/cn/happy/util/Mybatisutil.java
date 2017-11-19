package cn.happy.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lenovo on 2017/7/10.
 */
public class Mybatisutil {
    static String path= "mybatis-config.xml";
    static SqlSessionFactory factory;
    static {
        try {
            InputStream is= Resources.getResourceAsStream(path);
            factory= new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public SqlSession getSql(){
        return factory.openSession();
    }
}
