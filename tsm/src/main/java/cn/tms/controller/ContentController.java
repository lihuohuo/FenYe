package cn.tms.controller;


import cn.tms.entity.Content;
import cn.tms.entity.News;
import cn.tms.entity.Status;
import cn.tms.entity.UserInfo;
import cn.tms.service.IContentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2017/11/6.
 */
@Controller
@RequestMapping("/con")
public class ContentController {
    @Resource(name = "contentService")
    IContentService contentService;

    @ResponseBody
    @RequestMapping("/getAllContent")
    public Object getAllContent() {
        System.out.println("-----------------------------");
        //新的容器 保存有父子关系的权限
        List<Content> rootMenus = new ArrayList<Content>();
        //保存的是平级的权限集合  使用内存级别的手段，构造成有关系的权限集合
        List<Content> privilegeList = contentService.getAllContent();
        System.out.println(privilegeList);
        for (Content item : privilegeList) {
            Content childMenu = item;
            String pid = childMenu.getParentcode();
            if ("0".equals(pid)) {
                rootMenus.add(item);
            } else {
                for (Content innerMenu : privilegeList) {
                    String id = innerMenu.getSyscode();
                    if (id.equals(pid)) {
                        Content parentMenu = innerMenu;
                        parentMenu.getChildren().add(childMenu);
                        break;
                    }
                }
            }
        }
        return rootMenus;
    }

    @ResponseBody
    @RequestMapping("/getNewsByName")
    public Object getNewsByName(String columnname, HttpServletRequest request) throws UnsupportedEncodingException {
        String str = new String(columnname.getBytes("ISO-8859-1"), "UTF-8");//用tomcat的格式（iso-8859-1）方式去读。
        request.getSession().setAttribute("columnname", columnname);
        request.setAttribute("colimnames", columnname);
        List<News> allNews = contentService.getAllNews(columnname);
        System.out.println(allNews.size() + "====" + columnname);
        return allNews;
    }

    @ResponseBody
    @RequestMapping("/getAllStatus")
    public Object getAllStatus() {
        List<Status> allStatus = contentService.getAllStatus();
        return allStatus;
    }

    @ResponseBody
    @RequestMapping("/selectAllnews")
    public Object selectAllnews(@Param("status") String status, @Param("title") String title, HttpServletRequest request) {
        String columnname = (String) request.getSession().getAttribute("columnname");
        // System.out.println("++++++"+columnname+"------"+status+"-----"+title);
        List<News> allNews = contentService.selectAllnews(columnname, new Integer(status), title);
        System.out.println(allNews.size());
        return allNews;
    }


    @ResponseBody
    @RequestMapping("/addnews")
    public Object addnews(News news, HttpSession session) {
        UserInfo userInfo= (UserInfo) session.getAttribute("userinfo");
        String str= userInfo.getUsername();
        news.setCreator(String.valueOf(userInfo));
        System.out.println(userInfo);
        int count = contentService.addnews(news);


/*        news.setId(1);
        news.setTitle("詹姆斯");
        news.setColumnname("詹姆斯儿子");
        news.setClicks(0);
        news.setStatus(1);
        news.setCreator("admin");
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-mm-dd");
        Date date = new Date();
        String format = sdf.format(new Date());
        news.setUpdatetime(date);*/
        return count;
    }

/*    @ResponseBody
    @RequestMapping("/fileImage")
    public String fileImage(String code) {
        //String ossUrl = OssUtil.getOSSUrl("C:/Users/guo/Desktop/自定义mvc/" + image);
        //  System.out.println(ossUrl);
        // request.getSession().setAttribute("url", ossUrl);
        System.out.println(code + "222222222");
        return code;
    }*/

}