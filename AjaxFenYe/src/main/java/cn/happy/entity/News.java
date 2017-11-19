package cn.happy.entity;

/**
 * Created by lenovo on 2017/7/21.
 */
public class News {
    public Integer newsid;
    public String newstitle;
    public String newsContent;
    public Integer clickCount;
    public Talk talk;

    public Talk getTalk() {
        return talk;
    }

    public void setTalk(Talk talk) {
        this.talk = talk;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsid=" + newsid +
                ", newstitle='" + newstitle + '\'' +
                ", newsContent='" + newsContent + '\'' +
                ", clickCount=" + clickCount +
                '}';
    }

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }
}
