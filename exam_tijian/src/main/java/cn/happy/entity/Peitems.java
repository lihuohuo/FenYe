package cn.happy.entity;

import javax.persistence.*;

/**
 * Created by lenovo on 2017/10/18.
 */
@Entity
@Table
public class Peitems {
    @Id
    @GeneratedValue
    private Integer itemid;
    @Column
    private String itemname;
    @Column
    private Integer typeid;
    @Column
    private Integer necessary;
    @Column
    private String ref;
    @Column
    private Integer price;
    @Column
    private String info;
    
    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public Integer getNecessary() {
        return necessary;
    }

    public void setNecessary(Integer necessary) {
        this.necessary = necessary;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
