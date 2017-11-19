package cn.happy.action;

import cn.happy.bean.Dept;
import cn.happy.service.IDeptService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/10/29.
 */
@Controller("deptAction")
@ParentPackage("struts-default")
@Namespace("/")
@Scope("prototype")
public class DeptAction extends ActionSupport {
    private Dept dept;
    @Resource(name = "deptService")
    private IDeptService service;
    @Action(value = "add",results = {@Result(name = "success",location = "/jsp/index.jsp")})
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
