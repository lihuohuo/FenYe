package main.cn.happy.entity.hqlmanytomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by lenovo on 2017/10/11.
 */
@Entity
@Table(name = "Player")
public class player {

    @Id
    @GeneratedValue
    private  Integer pid;
    private  String pname;
}
