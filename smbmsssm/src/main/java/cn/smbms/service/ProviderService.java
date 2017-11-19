package cn.smbms.service;


import cn.smbms.entity.Smbms_provider;
import cn.smbms.util.PageUtil;

/**
 *
 */
public interface ProviderService {
    public PageUtil selestList(int pageIndex, int pageSize, String proname);

    public int proAdd(Smbms_provider provider);

    public Smbms_provider xiuBycha(int id);

    public int gai(Smbms_provider provider);

    public int del(int id);
}
