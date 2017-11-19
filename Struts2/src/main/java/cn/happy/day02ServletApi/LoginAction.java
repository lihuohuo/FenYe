package cn.happy.day02ServletApi;

import cn.happy.entity.UserInfo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import javafx.application.Application;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by lenovo on 2017/10/22.
 */
public class LoginAction implements Action, ServletRequestAware,ServletContextAware{
    private HttpServletRequest request;
    private  ServletContext servletContext;
    public String execute() throws Exception {
        ActionContext context = ActionContext.getContext();
        Map<String, Object> map = context.getSession();
        map.put("uname","科比");
        HttpServletRequest request = ServletActionContext.getRequest();
        ValueStack vs= (ValueStack) request.getAttribute("struts.valueStack");
        vs.push(map);

          /*  //Session
        HttpSession session = ServletActionContext.getRequest().getSession();
        //Request
        HttpServletRequest request = ServletActionContext.getRequest();
        //ServletContext application
        ServletContext servletContext = ServletActionContext.getServletContext();
        session.setAttribute("uname","admin");
     */
      /*  HttpSession session = request.getSession();
        session.setAttribute("username","张三");
        servletContext.setAttribute("xxx","yyy");*/



        return  SUCCESS;

    }



    public void setServletRequest(HttpServletRequest httpServletRequest) {
            this.request=httpServletRequest;
    }

    public void setServletContext(ServletContext servletContext) {
            this.servletContext=servletContext;
    }
}
