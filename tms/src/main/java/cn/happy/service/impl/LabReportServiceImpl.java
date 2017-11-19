package cn.happy.service.impl;


import cn.happy.dao.ILabReportDAO;
import cn.happy.entity.LabReport;
import cn.happy.service.ILabReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Happy on 2017-09-27.
 */
@Service("labReportService")
public class LabReportServiceImpl implements ILabReportService {
    //植入dao对象
    @Resource(name = "ILabReportDAO")
    ILabReportDAO labReportDAO;
    public int saveLabReport(LabReport labinfo) {
        return labReportDAO.saveLabReport(labinfo);
    }

    public LabReport getLabReport() {
        return labReportDAO.getLabReport();
    }
}
