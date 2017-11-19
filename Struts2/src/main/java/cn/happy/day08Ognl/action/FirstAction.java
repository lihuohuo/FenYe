package cn.happy.day08Ognl.action;


import cn.happy.day08Ognl.entity.UserInfo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

import java.util.Map;

/**
 * Created by lenovo on 2017/10/22.
 */
public class FirstAction implements Action {
    /*   private UserInfo userInfo;*/
    public String execute() throws Exception {
        UserInfo info = new UserInfo();
        info.setUsername("詹姆斯");
        //将info对象推入值栈
        //获取 栈值
        ValueStack vs = ActionContext.getContext().getValueStack();
        vs.getRoot().push(info);
        vs.push(info);
        return SUCCESS;

    }


}
