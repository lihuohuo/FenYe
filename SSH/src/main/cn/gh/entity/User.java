package cn.happy.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by guo on 2017/10/6.
 */
@Entity
@Table(name = "User")
public class User {
private String id;
private String name;
private String password;

    public String getPassword() {
        return password;
    }

    @Column(name = "password",length = 32)
    public void setPassword(String password) {
        this.password = password;
    }

    @Id
    @GenericGenerator(name="hibernate-uuid",strategy="uuid")
    @GeneratedValue(generator="hibernate-uuid")
    @Column(name = "id",unique = true,nullable = false,length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Column(name = "name",length = 32)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
