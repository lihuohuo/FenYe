package cn.happy.day07interceptor.action;



import com.opensymphony.xwork2.Action;

import java.util.Map;

/**
 * Created by lenovo on 2017/10/22.
 */
public class BookAction implements Action {
    public String execute() throws Exception {
        System.out.println("bookaction");
        return SUCCESS;
    }


}
