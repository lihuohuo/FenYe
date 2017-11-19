package cn.huohuo.entity;

import java.util.Date;

/**
 * Created by lenovo on 2017/9/1.
 */
public class Faqs {
    private int id;
    private String title;
    private Date createdate;
    private  String content;




    @Override
    public String toString() {
        return "IfaqsDao{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", createdate=" + createdate +
                ", content='" + content + '\'' +
                '}';
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

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
