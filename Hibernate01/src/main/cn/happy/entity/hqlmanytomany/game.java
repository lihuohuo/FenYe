package main.cn.happy.entity.hqlmanytomany;

import javax.naming.Name;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 2017/10/11.
 */
@Entity
@Table(name = "Game")
public class game {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Sql_Game")
    @SequenceGenerator(name = "sql_Game",sequenceName = "sql_Game",allocationSize = 1,initialValue = 1)
    private  Integer gid;
    @Column
    private String gname;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PG",joinColumns = {@JoinColumn(name="gid")},inverseJoinColumns ={@JoinColumn(name = "pid")} )
    private Set<player> players=new HashSet<player>();

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Set<player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<player> players) {
        this.players = players;
    }
}
