package cn.bdqn.service;

import cn.bdqn.entity.Classes;
import cn.bdqn.entity.Faqs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by guo on 2017/9/1.
 */
public interface IClassesService {
    public List<Classes> SelectAll(@Param("cname") String cname);
    public Faqs SelectAllById(int id);
    public List<Classes> SelectAlls();
    public int InsertFaqs(Faqs f);
}
