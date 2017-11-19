package cn.happy.dao;


import cn.happy.entity.Column;

import java.util.List;

/**
 * Created by Happy on 2017-11-06.
 * 栏目DAO
 */
public interface IColumnDAO {
    //加载所有栏目集合
    public List<Column> findAllColumns();
}
