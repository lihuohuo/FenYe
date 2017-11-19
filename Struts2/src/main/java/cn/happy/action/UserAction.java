package cn.happy.action;

import cn.happy.entity.UserInfo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

import java.util.Map;

/**
 * Created by lenovo on 2017/10/22.
 */
public class UserAction implements Action, ModelDriven<UserInfo> {
    private UserInfo userInfo = new UserInfo();

    public UserInfo getModel() {
        return userInfo;
    }

    public String execute() throws Exception {
        if ("admin".equals(userInfo.getUsername()) && "admin".equals(userInfo.getPassword())) {

            return SUCCESS;
        } else {
            return INPUT;
        }

    }


    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }


}
