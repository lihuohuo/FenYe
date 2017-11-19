package cn.happy.entity;

import java.util.Date;

/**
 * Created by lenovo on 2017/7/21.
 */
public class Talk {
    public Integer tid;
    public String content;
    public Date talktime;
    public Integer nid;
    public News news;

    public News getNews() {
        return news;
    }


    public void setNews(News news) {
        this.news = news;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTalktime() {
        return talktime;
    }

    public void setTalktime(Date talktime) {
        this.talktime = talktime;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }
}
