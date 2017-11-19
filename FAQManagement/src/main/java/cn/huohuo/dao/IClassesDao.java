package cn.huohuo.dao;


import cn.huohuo.entity.Classes;
import cn.huohuo.entity.Faqs;

import java.util.List;

/**
 * Created by lenovo on 2017/9/1.
 */
public interface IClassesDao {
    public List<Classes> list();
    public List<Classes> selectAll();
    public int Add(Faqs faqs);
    public Faqs listFaqsById(int id);
}
