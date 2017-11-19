package cn.smbms.service.impl;


import cn.smbms.dao.IProviderDAO;
import cn.smbms.entity.Smbms_provider;
import cn.smbms.service.ProviderService;
import cn.smbms.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Service("ProviderService")
public class ProviderServiceImpl implements ProviderService {
    @Resource(name = "IProviderDAO")
    IProviderDAO dao;
    public PageUtil selestList(int pageIndex, int pageSize, String proname) {
        Map<String,Object> map=new HashMap<String ,Object>();
        map.put("pageIndex",pageIndex*pageSize);
        map.put("pageSize",pageSize);
        map.put("userName",proname);
        PageUtil page=new PageUtil();
        //当前页
        page.setPageIndex(pageIndex);
        //页大小
        page.setPageSize(pageSize);
        //分页中的数据
        List<Smbms_provider> smbms_providers = dao.selestList(map);

        for (Smbms_provider item:smbms_providers){
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            Date providercreattime = item.getProvidercreattime();
            item.setDatas(sdf.format(providercreattime));
        }
     page.setList(smbms_providers);
        //总记录数
        page.setTotalRecords(dao.count(proname));
        System.out.println(page.getTotalRecords());
        //总页数
        page.setTotalPages(dao.count(proname)%page.getPageSize()==0?page.getTotalRecords()/pageSize:page.getTotalRecords()/page.getPageSize()+1);
        return page;
    }

    public int proAdd(Smbms_provider provider) {
        return dao.proAdd(provider);
    }

    public Smbms_provider xiuBycha(int id) {
        Smbms_provider smbms_provider = dao.xiuBycha(id);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date providercreattime = smbms_provider.getProvidercreattime();
        smbms_provider.setDatas(sdf.format(providercreattime));
        return smbms_provider;
    }

    public int gai(Smbms_provider provider) {
        int gai = dao.gai(provider);
        return gai;
    }

    public int del(int id) {
        return dao.del(id);
    }
}
