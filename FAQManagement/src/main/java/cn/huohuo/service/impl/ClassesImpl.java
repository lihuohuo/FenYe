package cn.huohuo.service.impl;

import cn.huohuo.dao.IClassesDao;
import cn.huohuo.entity.Classes;
import cn.huohuo.entity.Faqs;
import cn.huohuo.service.IClassesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2017/9/1.
 */
@Service("classesService")
public class ClassesImpl implements IClassesService {
    //植入dao
   @Resource(name="IClassesDao")
    IClassesDao iClassesDao;


    public List<Classes> list() {
        return iClassesDao.list();
    }

    public List<Classes> selectAll() {
        return iClassesDao.selectAll();
    }

    public int Add(Faqs faqs) {
        return iClassesDao.Add(faqs);
    }

    public Faqs listFaqsById(int id) {
        return iClassesDao.listFaqsById(id);
    }
}
