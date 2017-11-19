package cn.happy.day07interceptor.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import java.util.Map;
import java.util.Vector;

/**
 * Created by lenovo on 2017/10/25.
 */
public class MyTimerInterceptor implements Interceptor {

    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("对象" + actionInvocation);

        Object action = actionInvocation.getAction();

        System.out.println("action==========" + action);
        String value;
        //判定session里面key值对应的value是否存在
        Map<String, Object> map = ActionContext.getContext().getSession();
        Object name = map.get("uname");

        String actionName = actionInvocation.getProxy().getActionName();
        actionInvocation.getProxy().getNamespace();//user
        System.out.println("actionName======" + actionName);
        if (actionName.equals("login")) {
            System.out.println("==============Action是login");

            value = actionInvocation.invoke();
        } else if (name != null) {
            //已登录   放行
            value = actionInvocation.invoke();
            String method = actionInvocation.getProxy().getMethod();
            System.out.println("方法" + method);
        } else {
            //走到 这个else ,证明你访问的是Action      不是登录  也不是被授权的访问的操作
            value = "login";
        }
        System.out.println("逻辑视图名" + value);
        return value;
    }

    public void destroy() {
    }

    public void init() {
        System.out.println("拦截器已经初始化。。。。。。。。。。。");
    }

}
