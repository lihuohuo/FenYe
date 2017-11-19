package cn.huohuo.service;


import cn.huohuo.entity.Classes;
import cn.huohuo.entity.Faqs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by guo on 2017/9/1.
 */
public interface IClassesService {
    public List<Classes> list (String cname);
    public Faqs  seleectId(int id);
    public List<Classes> selectall();
    public int Insert(Faqs f);
}
