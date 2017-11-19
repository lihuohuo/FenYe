import cn.happy.dao.UserDao;
import cn.happy.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;


/**
 * Created by lenovo on 2017/7/5.
 */
public class BlogTest {
    SqlSession sqlSession;
    UserDao dao;
    @Before
    public void before() {
        sqlSession = MyBatisUtil.getSqlSession();
        dao = sqlSession.getMapper(UserDao.class);
    }
@Test
public void Login() throws IOException {

}


    @After
    public void after() {
        sqlSession.commit();
        sqlSession.close();
    }

}
