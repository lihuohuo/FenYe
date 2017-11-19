package cn.happy.day07interceptor.action;


import cn.happy.day07interceptor.entity.UserInfo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by lenovo on 2017/10/22.
 */
public class LoginAction implements Action {
    private UserInfo userInfo;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String execute() throws Exception {
        Map<String, Object> session = ActionContext.getContext().getSession();
        if (userInfo != null) {
            if (userInfo.getUsername().equals("1") && userInfo.getPassword().equals("1")) {
                //省略一个步骤,记录session
                session.put("uname", userInfo.getUsername());
                return SUCCESS;
            } else {
                return LOGIN;
            }
        } else {  //不是从页面过来的
            if (session != null && session.get("uname") != null) {
                return "success";
            } else {
                System.out.println("Action中的自定义代码");
                return "login";
            }
        }


    }


}
