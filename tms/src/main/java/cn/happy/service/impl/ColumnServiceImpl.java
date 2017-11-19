package cn.happy.service.impl;


import cn.happy.dao.IColumnDAO;
import cn.happy.entity.Column;
import cn.happy.service.IColumnService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Happy on 2017-11-06.
 */
@Service("columnService")
public class ColumnServiceImpl implements IColumnService {
    @Resource(name = "IColumnDAO")
    private IColumnDAO columnDAO;
    public List<Column> findAllColumns() {
        return columnDAO.findAllColumns();
    }
}
