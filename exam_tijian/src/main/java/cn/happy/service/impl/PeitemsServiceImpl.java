package cn.happy.service.impl;

import cn.happy.dao.PeitemsDao;
import cn.happy.entity.Peitems;
import cn.happy.service.PeitemsService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2017/10/18.
 */
@Transactional
@Repository("PeitemsService")
public class PeitemsServiceImpl implements PeitemsService {
    @Resource(name = "PeitemsDao")
    private PeitemsDao peitemsDao;


    public List<Peitems> select() {
        return peitemsDao.selectp();
    }

    public List<Peitems> perlist(String typename) {
        return peitemsDao.perlist(typename);
    }

    public Peitems find(Integer itemid) {
        return peitemsDao.find(itemid);
    }

    public PeitemsDao getPeitemsDao() {
        return peitemsDao;
    }

    public void setPeitemsDao(PeitemsDao peitemsDao) {
        this.peitemsDao = peitemsDao;
    }

}
