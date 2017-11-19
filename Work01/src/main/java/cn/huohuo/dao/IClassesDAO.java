package cn.huohuo.dao;


import cn.huohuo.entity.Classes;
import cn.huohuo.entity.Faqs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by guo on 2017/9/1.
 */
public interface IClassesDAO {
  public List<Classes> list ();
  public Faqs  seleectId(int id);
  public List<Classes> selectall();
  public int Insert(Faqs f);
}
