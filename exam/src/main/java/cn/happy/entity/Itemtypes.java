package cn.happy.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

/**
 * Created by lenovo on 2017/10/18.
 */
@Entity
public class Itemtypes {
    @Id
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
