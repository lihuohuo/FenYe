package cn.happy.Spring02;

/**
 * Created by lenovo on 2017/7/24.
 */
public class Car {
    private String color;
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brang='" + brand + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrang() {
        return brand;
    }

    public void setBrang(String brang) {
        this.brand = brang;
    }
}
