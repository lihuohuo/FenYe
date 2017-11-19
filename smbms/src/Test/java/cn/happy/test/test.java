/*
package cn.bdqn.test;


import cn.bdqn.entity.Provider;
import cn.bdqn.util.Mybatisutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.security.PublicKey;
import java.util.List;

*/
/**
 * Created by lenovo on 2017/7/10.
 *//*

public class test {
  Mybatisutil util=new Mybatisutil();

    //查询总记录数
   @Test
    public void count(){
        SqlSession session = util.getSql();
        IProviderDAO dao = session.getMapper(IProviderDAO.class);
        int count = dao.selectcount();
        System.out.println(count);
    }

    @Test
    //查询供应商表全部数据
    public void selectget(){
        SqlSession session = util.getSql();
        IProviderDAO dao = session.getMapper(IProviderDAO.class);
        List<Provider> list = dao.selectgetAll();
        for (Provider item:list) {
            System.out.println(item.getProCode());
            System.out.println(item.getProName());
            System.out.println(item.getProDesc());
            System.out.println(item.getProContact());
            System.out.println(item.getProPhone());
            System.out.println(item.getProAddress());
            System.out.println(item.getProFax());
            System.out.println(item.getCreatedBy());
            System.out.println(item.getCreationDate());
            System.out.println(item.getModifyBy());
            System.out.println(item.getModifyDate());

        }
    }

}
*/
