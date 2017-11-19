package cn.happy.service.impl;

import cn.happy.dao.ItemtypeDao;
import cn.happy.entity.Itemtypes;
import cn.happy.service.ItemtypeService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2017/10/18.
 */
@Transactional
@Repository("ItemtypeService")
public class ItemtypeServiceImpl implements ItemtypeService {
    @Resource(name = "ItemtypeDao")
    private ItemtypeDao itemtypeDao;

    public ItemtypeDao getItemtypeDao() {
        return itemtypeDao;
    }

    public void setItemtypeDao(ItemtypeDao itemtypeDao) {
        this.itemtypeDao = itemtypeDao;
    }

    public List<Itemtypes> selectitem() {
        return itemtypeDao.selectitem();
    }
}
