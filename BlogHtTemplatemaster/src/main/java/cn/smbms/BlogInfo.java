package cn.smbms;

/**
 * Created by guo on 2017/7/5.
 */
public class BlogInfo {
    private int blogid;
    private String blogauthor;
    private String blogaddress;
    private int blogdel;

    public int getBlogid() {
        return blogid;
    }

    public void setBlogid(int blogid) {
        this.blogid = blogid;
    }

    public String getBlogauthor() {
        return blogauthor;
    }

    public void setBlogauthor(String blogauthor) {
        this.blogauthor = blogauthor;
    }

    public String getBlogaddress() {
        return blogaddress;
    }

    public void setBlogaddress(String blogaddress) {
        this.blogaddress = blogaddress;
    }

    public int getBlogdel() {
        return blogdel;
    }

    public void setBlogdel(int blogdel) {
        this.blogdel = blogdel;
    }
}
