package cn.happy.entity;


import javax.persistence.*;

/**
 * Created by lenovo on 2017/10/18.
 */
@Entity
@Table
public class Itemtypes {
    @Id
    @GeneratedValue
    private  Integer typeid;
    @Column
    private  String typename;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}
