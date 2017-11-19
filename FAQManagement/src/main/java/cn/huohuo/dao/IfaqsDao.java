package cn.huohuo.dao;


import cn.huohuo.entity.Faqs;

import java.util.List;

/**
 * Created by lenovo on 2017/9/1.
 */
public interface IfaqsDao {
    public List<Faqs> list();

    public String Add(Faqs ifaqs);
}
