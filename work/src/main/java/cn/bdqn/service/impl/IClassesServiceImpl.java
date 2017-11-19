package cn.bdqn.service.impl;

import cn.bdqn.dao.IClassesDAO;
import cn.bdqn.entity.Classes;
import cn.bdqn.entity.Faqs;
import cn.bdqn.service.IClassesService;
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

    public List<Classes> SelectAll(@Param("cname") String cname) {
        return iClassesDAO.SelectAll(cname);
    }

    public Faqs SelectAllById(int id) {
        return iClassesDAO.SelectAllById(id);
    }

    public List<Classes> SelectAlls() {
        return iClassesDAO.SelectAlls();
    }

    public int InsertFaqs(Faqs f) {
        return iClassesDAO.InsertFaqs(f);
    }
}
