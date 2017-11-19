package cn.happy.controller04ReturObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lenovo on 2017/8/21.
 */
@Controller
public class AddBook {
    @RequestMapping("/addBook")
    public String addBook(HttpServletRequest request) {
        request.setAttribute("bookname", "钢铁是怎样=====");
        return "redirect:/list";
    }
    @RequestMapping("/list")
    public  String listBook(){
        return "/listBook.jsp";

    }
}
