package cn.happy.controller10fileupload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.jws.WebResult;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

/**
 * Created by lenovo on 2017/8/30.
 */
@Controller
public class FirstController {
    @RequestMapping("/first")
    public String doFirst(@RequestParam  MultipartFile[] upload, HttpSession session, HttpServletRequest request) {
        for (MultipartFile item : upload) {
            if (item.getSize() > 0) {
                String parentPath = session.getServletContext().getRealPath("/upload");
                //获取用户上传 文件名称
                String childaname = item.getOriginalFilename();
                if (childaname.endsWith(".jpg") || childaname.endsWith(".png") || childaname.endsWith(".gif") || childaname.endsWith(".bmp")) {

                    File filepath = new File(parentPath, childaname);
                    try {
                        item.transferTo(filepath);
                        return "/typeconverter.jsp";
                    } catch (IOException e) {
                        e.printStackTrace();
                        return "/fileupload.jsp";
                    }

                }


            } else {
                request.setAttribute("msg", "请选择一个非空文件进行上传！");
                return "/fileupload.jsp";
            }

        }
        return "/typeconverter.jsp";
    }
}
