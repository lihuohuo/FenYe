package cn.happy.test;

import cn.happy.dao.IUserDao;
import cn.happy.dao.StudentDao;
import cn.happy.entity.Student;
import cn.happy.entity.UserInfo;
import cn.happy.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/7/4.
 */
public class MyBatisUtilTest {
    SqlSession sqlSession;
    IUserDao dao;

    @Before
    public void before() {
        sqlSession = MyBatisUtil.getSqlSession();
        dao = sqlSession.getMapper(IUserDao.class);
    }


    @After
    public void after() {
        sqlSession.commit();
        sqlSession.close();
    }


















    @Test
    public void findByChoose(){
  SqlSession session =null;
        try {
            session=MyBatisUtil.getSqlSession();
            StudentDao dao = session.getMapper(StudentDao.class);
            String stuname ="111";
            int stuage=20;
            Student stu= new Student();
            stu.setStuname(stuname);
            stu.setStuage(stuage);
            List<Student> list = dao.findByChoose(stu);
            for (Student item :list){
                System.out.println(item.getStuname());
            }
        } finally {
            session.close();
        }




    }







    // if 智能标签
    @Test
    public  void findByIf(){
        SqlSession session=null;
        session=MyBatisUtil.getSqlSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        String stuname ="111";
        int stuage =20;
        Student stu= new Student();
        stu.setStuname(stuname);
        stu.setStuage(stuage);
        List<Student> list = dao.findByIf(stu);
        for (Student item:list){
            System.out.println(item.getStuname());
session.close();

        }
    }


    //按照索引号查询
@Test
public void findStudentParameter(){
 SqlSession session = null;

    session=MyBatisUtil.getSqlSession();
 StudentDao dao=session.getMapper(StudentDao.class);
 String stuname="111";
 int stuage=20;
 List<Student> list =dao.findStudentParameter(stuname,stuage);
 for(Student item:list){
     System.out.println(item.getStuname());


 }
session.close();



}






    @Test
    public void findStudent() {
        SqlSession session = null;
        try {
            session = MyBatisUtil.getSqlSession();
            StudentDao dao = session.getMapper(StudentDao.class);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("stuname", "1");
            map.put("stuage", 20);
            List<Student> list = dao.findStudent(map);
            System.out.println(list+"--------------------");
            for (Student stu : list) {
                System.out.println("================"+stu.getStuname());
            }
        } finally {
        session.close();
    }

}














//if
    @Test
    public void ifselectList(){
        String name="123";
        List<UserInfo> list =dao.ifselectList(name);
        for (UserInfo item:list){
            System.out.println(item.getName());
        }


    }
//where
    @Test
    public void whereselectList(){
        String name="123";
        List<UserInfo> list =dao.whereselectList(name);
        for (UserInfo item:list){
            System.out.println(item.getName());
        }


    }
    //trim if
    @Test
    public void trimselectList(){
        String name="123";
        List<UserInfo> list =dao.trimselectList(name);
        for (UserInfo item:list){
            System.out.println(item.getName());
        }


    }
    @Test
    //set进行修改
    public void setmodify(){
        UserInfo user=new UserInfo();
       user.setName("111");
       user.setId(1);
      int count=dao.setmodify(user);

            System.out.println(count);



    }

    @Test
    //if trim进行修改
    public void iftrimmodify(){
        UserInfo user=new UserInfo();
        user.setName("222");
        user.setId(1);
        int count=dao.iftrimmodify(user);

        System.out.println(count);
    }
/*  ForEach   */
    @Test
    public  void ForEach(){


        List<UserInfo> list =new ArrayList<UserInfo>();
        String[] names={"123","222"};
        list=dao.ForEachs(names);
        for(UserInfo item:list){

            System.out.println(item.getName());
        }

    }


    /*For Eachs  List*/
  @Test
    public void ForEachsList(){
      List<UserInfo> list =new ArrayList<UserInfo>();
     List<String> rl= new ArrayList<String>();
    rl.add("123");
    rl.add("222");
    list=dao.ForEachsList(rl);
    for (UserInfo item:list){
        System.out.println(item.getName());
    }


  }
}
