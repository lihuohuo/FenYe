package cn.smbms.controller;

import cn.smbms.entity.Smbms_provider;
import cn.smbms.service.ProviderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created
 */
@Controller
public class ProviderControllrt {
    @Resource(name = "ProviderService")
    ProviderService service;
    @ResponseBody
    @RequestMapping("/list")
    public Object selectList(@RequestParam(defaultValue = "1")int pageIndex,@RequestParam(defaultValue = "2") int pageSize,String proname) {
        return service.selestList(pageIndex,pageSize,proname);
    }
    @ResponseBody
    @RequestMapping("/add")
    public Object add(Smbms_provider provider){
        System.out.println(provider.getProvidername()+"--------------------------------");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=new Date();
        String format = sdf.format(new Date());
        provider.setDatas(format);
        return service.proAdd(provider);
    }
    @RequestMapping("/xiuBycha")
    public String xiuBycha(int id,HttpServletRequest request){
        System.out.println("111111111111111111111111111111");
        Smbms_provider smbms_provider = service.xiuBycha(id);
        request.getSession().setAttribute("smbms_provider",smbms_provider);
        return "providerUpdate";
    }
    @ResponseBody
    @RequestMapping("/gai")
    public Object gai(Smbms_provider provider){
 /*       System.out.println(provider.getProviderid());
        System.out.println(provider.getProvidername());
        System.out.println(provider.getProviderabout());
        System.out.println(provider.getProvideraddress());
        System.out.println(provider.getProvidercode());
        System.out.println(provider.getDatas());
        System.out.println(provider.getProviderFax());
        System.out.println(provider.getProviderphone());
*/
        int gai = service.gai(provider);
       // System.out.println("con--------------------"+gai);
        return gai;
    }
    @ResponseBody
    @RequestMapping("/del")
    public Object del(String str){
        int del=0;
        String[] split = str.split(",");
        for (int i=0;i<split.length;i++){
            System.out.println(split[i]);
            del=service.del(Integer.parseInt(split[i]));
        }
        System.out.println(del);
        return del;
    }
}
