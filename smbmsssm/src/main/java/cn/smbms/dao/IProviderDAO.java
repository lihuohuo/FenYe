package cn.smbms.dao;



import cn.smbms.entity.Smbms_provider;

import java.util.List;
import java.util.Map;

/**
 *
 */
public interface IProviderDAO {
    public List<Smbms_provider> selestList(Map<String, Object> map);
    public int count(String proname);
    public int proAdd(Smbms_provider provider);
    public Smbms_provider xiuBycha(int id);
    public int gai(Smbms_provider provider);
    public int del(int id);
}
