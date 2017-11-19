package cn.smbms.controller;

import cn.smbms.entity.UserInfo;
import cn.smbms.service.IUserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2017/8/21.
 */
@Controller
public class UserInfoController {
    @Resource(name = "userService")
    IUserInfoService userInfoService;


    @RequestMapping("/isLogin")
    public String isLogin(UserInfo info) {
        UserInfo user = userInfoService.isLogin(info);
        if (user != null && user.getUserName() != null) {
            //login  成功
            return "welcome";

        } else {
            return "login";
        }
    }

    @RequestMapping("/showUserList")
    public String showUserList() {
        return "userList";
    }

    @ResponseBody
    @RequestMapping("/getUserInfo")
    public Object getUserInfo(@RequestParam(defaultValue = "1") int pageIndex, @RequestParam(defaultValue = "2") int pageSize) {
        return userInfoService.getOnePageData(pageIndex, pageSize);
    }

    @RequestMapping("/useradd")
    public String userAdd(UserInfo userInfo) throws Exception {
        System.out.println("=========");
        int count = userInfoService.userAdd(userInfo);
       /* System.out.println(count);*/
        if (count > 0) {
            System.out.println("添加成功");
            return "userList";
        } else {

            System.out.println("添加失败");
        }


    /*    System.out.println("===================================");
        String userCode = request.getParameter("userCode");
        String userName = request.getParameter("userName");
        System.out.println(userName);

        String userPassword = request.getParameter("userPassword");
        int usergender = Integer.parseInt(request.getParameter("gender"));
        String userbirthday = request.getParameter("birthday");
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        Date date = sdf.parse(userbirthday.replace('/', '-'));
        String userphone = request.getParameter("phone");
        String useraddress = request.getParameter("address");
        String userRole = request.getParameter("userRole");
        System.out.println(userRole);
        UserInfo userinfo = new UserInfo();
        userinfo.setUserCode(userCode);
        userinfo.setUserName(userName);
        userinfo.setUserPassword(userPassword);
        userinfo.setBirthday(date);
        userinfo.setPhone(userphone);
        userinfo.setAddress(useraddress);
        userinfo.setUserRole(userRole);
        userinfo.setGender(usergender);
        int count = userInfoService.userAdd(userinfo);
        if (count > 0) {
            System.out.println("添加成功");
            return "userAdd";
        }*/


        return "userAdd";

    }

    @ResponseBody
    @RequestMapping("/UpdateList")
    public String UpdateList(int id, HttpServletRequest request) {

        request.getSession().setAttribute("userinfo", userInfoService.UpdateList(id));

        return "updateUser";
    }


    @ResponseBody
    @RequestMapping("/updateUser")
    public Object updateUser(UserInfo userInfo) {
        System.out.println(userInfo.getGender());
        int i = userInfoService.updateUser(userInfo);
        return i;
    }

    /*   @RequestMapping("/showUpdate")
      public Object showUpdate(UserInfo userInfo,HttpServletRequest request) throws Exception {
           List<UserInfo> list= userInfoService.updateUser(userInfo.getId());
           request.setAttribute("list",list);
       }*/
    @ResponseBody
    @RequestMapping("/deleteUser")
    public Object deleteUser(String ids) {
        String[] splits = ids.split(",");
        int i = 0;

        for (int ii = 0; i < splits.length; ii++) {
            i = userInfoService.deleteUser(Integer.parseInt(splits[i]));
        }
        return i;

    }

    @RequestMapping("/Esc")
    public  Object Esc(HttpServletRequest request){
        request.removeAttribute("userName");
        return "login";
    }
}
