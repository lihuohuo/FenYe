package cn.happy.entity;

/**
 * Created by lenovo on 2017/10/16.
 */
public class driver {
    private  Integer id;
    private  String name;
    private  Integer cityAreaId;
    private  String address;
    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCityAreaId() {
        return cityAreaId;
    }

    public void setCityAreaId(Integer cityAreaId) {
        this.cityAreaId = cityAreaId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
