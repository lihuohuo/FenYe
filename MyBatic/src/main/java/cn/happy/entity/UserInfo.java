package cn.happy.entity;

/**
 * Created by lenovo on 2017/6/29.
 */
public class UserInfo {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public UserInfo(){

    }
}
