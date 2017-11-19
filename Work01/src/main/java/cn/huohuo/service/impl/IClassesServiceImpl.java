package cn.huohuo.service.impl;


import cn.huohuo.dao.IClassesDAO;
import cn.huohuo.entity.Classes;
import cn.huohuo.entity.Faqs;
import cn.huohuo.service.IClassesService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by guo on 2017/9/1.
 */
@Service("classesService")
public class IClassesServiceImpl implements IClassesService {
@Resource(name = "IClassesDAO")
    IClassesDAO iClassesDAO;


    public List<Classes> list() {
        return iClassesDAO.list();
    }

    public List<Classes> list(String cname) {
        return iClassesDAO.list();
    }

    public Faqs seleectId(int id) {
        return iClassesDAO.seleectId(id);
    }

    public List<Classes> selectall() {
        return iClassesDAO.selectall();
    }

    public int Insert(Faqs f) {
        return iClassesDAO.Insert(f);
    }
}
