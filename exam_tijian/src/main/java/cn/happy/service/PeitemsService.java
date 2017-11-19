package cn.happy.service;

import cn.happy.entity.Peitems;

import java.util.List;

/**
 * Created by lenovo on 2017/10/18.
 */
public interface PeitemsService {
    public List<Peitems> select();
    public  List<Peitems> perlist(String typename);
    public  Peitems find(Integer itemid);


}
