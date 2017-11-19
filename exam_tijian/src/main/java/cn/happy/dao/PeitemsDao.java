package cn.happy.dao;

import cn.happy.entity.Itemtypes;
import cn.happy.entity.Peitems;

import java.util.List;

/**
 * Created by lenovo on 2017/10/18.
 */
public interface PeitemsDao {
    public List<Peitems> selectp();
    public List<Peitems> perlist (String typename);
    public  Peitems  find(Integer item);
    public void update(String itemname,Integer typeid,Integer necessary,String ref,Integer price,String info,Integer itemid);
}
