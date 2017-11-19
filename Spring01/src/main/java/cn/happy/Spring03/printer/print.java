package cn.happy.Spring03.printer;

import cn.happy.Spring03.ink.Ink;
import cn.happy.Spring03.paper.Paper;

/**
 * Created by lenovo on 2017/7/24.
 */
public class print {
            private Paper p;
            private Ink ink;

    @Override
    public String toString() {
        return "print{" +
                "p=" + p.Apaper()+
                ", ink=" + ink.inkColor() +
                '}';
    }

    public Paper getP() {
        return p;
    }

    public void setP(Paper p) {
        this.p = p;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }
}
