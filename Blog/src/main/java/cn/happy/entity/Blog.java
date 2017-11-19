package cn.happy.entity;

/**
 * Created by lenovo on 2017/7/5.
 */
public class Blog {
    private Integer blogId;
    private  String blogAuthor;
    private String blogAddress;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogAuthor() {
        return blogAuthor;
    }

    public void setBlogAuthor(String blogAuthor) {
        this.blogAuthor = blogAuthor;
    }

    public String getBlogAddress() {
        return blogAddress;
    }

    public void setBlogAddress(String blogAddress) {
        this.blogAddress = blogAddress;
    }

    public Boolean getBlogDel() {
        return blogDel;
    }

    public void setBlogDel(Boolean blogDel) {
        this.blogDel = blogDel;
    }

    private Boolean blogDel;

}
