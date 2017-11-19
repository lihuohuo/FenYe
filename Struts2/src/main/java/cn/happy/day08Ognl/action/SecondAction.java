package cn.happy.day08Ognl.action;



import com.opensymphony.xwork2.Action;

/**
 * Created by lenovo on 2017/10/22.
 */
public class SecondAction implements Action {
    public String execute() throws Exception {
        System.out.println("bookaction");
        return SUCCESS;
    }


}
