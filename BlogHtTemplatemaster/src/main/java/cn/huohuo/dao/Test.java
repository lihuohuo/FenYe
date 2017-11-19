package cn.huohuo.dao;

import cn.smbms.BlogInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by guo on 2017/7/5.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        InputStream stream= Resources.getResourceAsStream("MyBatis-config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(stream);
        //软
        SqlSession session = factory.openSession();
        IBlogDao dao = session.getMapper(IBlogDao.class);
        /*List<BlogInfo> blogInfos = dao.SelectAll(0, 3);
        for (BlogInfo b:blogInfos) {
            System.out.println(b.getBlogaddress());
        }*/
        BlogInfo b=new BlogInfo();
        b.setBlogid(1);
        b.setBlogaddress("guohua");
        b.setBlogauthor("guohua");
        dao.InsertBlog(b);
        //session.commit();
    }

}
