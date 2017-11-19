package cn.happy.action;

import cn.happy.bean.Dept;
import cn.happy.service.IDeptService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lenovo on 2017/10/29.
 */
public class DeptAction extends ActionSupport {
    private Dept dept;
    private IDeptService service;

    public String add() {
        System.out.println(dept);
        service.addDept(dept);
        return SUCCESS;
    }


    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public IDeptService getService() {
        return service;
    }

    public void setService(IDeptService service) {
        this.service = service;
    }
}
