package cn.happy.action;

/**
 * Created by guo on 2017/10/21.
 */
public class LoginAction {
    //前台的数据
    //用户名
    private String username;
    //用户密码
    private String userpass;
    //提供对应的get和set方法
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUserpass() {
        return userpass;
    }
    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }
    //action的核心方法，，调用action方法处理前台的数据
    public String execute(){
        System.out.println("调用了execute方法。。。");

        System.out.println(username);
        System.out.println(userpass);
        //在这里我们是把用户名和密码写死的，只是见的的代码实现而已。
        //规定用户名和密码分别为aaa和123
        if (username.equals("aaa")&&userpass.equals("123")){
            //正确    返回"success"
            return "success";
        }else {
            //验证失败   直接就返回"fail"
            return "fail";
        }
    }
}
