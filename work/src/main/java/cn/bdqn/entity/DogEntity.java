package cn.bdqn.entity;

import javax.persistence.*;

/**
 * Created by lenovo on 2017/10/20.
 */
@Entity
@Table(name = "DOG", schema = "HUOHUO01", catalog = "")
public class DogEntity {
    private long id;
    private String name;
    private Long age;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "AGE")
    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogEntity dogEntity = (DogEntity) o;

        if (id != dogEntity.id) return false;
        if (name != null ? !name.equals(dogEntity.name) : dogEntity.name != null) return false;
        if (age != null ? !age.equals(dogEntity.age) : dogEntity.age != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}
