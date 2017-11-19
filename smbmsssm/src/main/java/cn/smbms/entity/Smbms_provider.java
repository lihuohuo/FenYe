package cn.smbms.entity;

import java.util.Date;

/**
 * Created by Mr.Gao on 2017/9/6.
 */
public class Smbms_provider {
    private int providerid;
    private String providercode;
    private String providername;
    private String provideruser;
    private int providerphone;
    private Date providercreattime;
    private String provideraddress;
    private String providerFax;
    private String providerabout;
    private String datas;

    public String getDatas() {

        return datas;
    }

    public void setDatas(String datas) {
        this.datas = datas;
    }

    public int getProviderid() {
        return providerid;
    }

    public void setProviderid(int providerid) {
        this.providerid = providerid;
    }

    public String getProvidercode() {
        return providercode;
    }

    public void setProvidercode(String providercode) {
        this.providercode = providercode;
    }

    public String getProvidername() {
        return providername;
    }

    public void setProvidername(String providername) {
        this.providername = providername;
    }

    public String getProvideruser() {
        return provideruser;
    }

    public void setProvideruser(String provideruser) {
        this.provideruser = provideruser;
    }

    public int getProviderphone() {
        return providerphone;
    }

    public void setProviderphone(int providerphone) {
        this.providerphone = providerphone;
    }

    public Date getProvidercreattime() {
        return providercreattime;
    }

    public void setProvidercreattime(Date providercreattime) {
        this.providercreattime = providercreattime;
    }

    public String getProvideraddress() {
        return provideraddress;
    }

    public void setProvideraddress(String provideraddress) {
        this.provideraddress = provideraddress;
    }

    public String getProviderFax() {
        return providerFax;
    }

    public void setProviderFax(String providerFax) {
        this.providerFax = providerFax;
    }

    public String getProviderabout() {
        return providerabout;
    }

    public void setProviderabout(String providerabout) {
        this.providerabout = providerabout;
    }
}
