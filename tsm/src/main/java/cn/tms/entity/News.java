package cn.tms.entity;

import java.util.Date;

public class News {
    private int id;
    private String title;
    private String columnname;
    private int clicks;
    private int status;
    private String creator;
    private Date updatetime;
    private String tag; //关键字
    private String conents;//  正文
    private String abstras;//摘要
    private  String userid;//用户

    private Content content;


    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getConents() {
        return conents;
    }

    public void setConents(String conents) {
        this.conents = conents;
    }

    public String getAbstras() {
        return abstras;
    }

    public void setAbstras(String abstras) {
        this.abstras = abstras;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }


    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
