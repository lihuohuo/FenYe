package cn.happy.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Happy on 2017-11-06.
 * 栏目实体
 */
public class Column {
    private String syscode;
    private Integer columncode;
    private String columnname;//栏目名称
    private Integer sort; //排序
    private String parentcode; //父级编码
    private Integer status;// 状态
    private String remark;//备注信息

    //逻辑属性
    private List<Column> children=new ArrayList<Column>();

    public List<Column> getChildren() {
        return children;
    }

    public void setChildren(List<Column> children) {
        this.children = children;
    }

    public String getSyscode() {
        return syscode;
    }

    public void setSyscode(String syscode) {
        this.syscode = syscode;
    }

    public Integer getColumncode() {
        return columncode;
    }

    public void setColumncode(Integer columncode) {
        this.columncode = columncode;
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getParentcode() {
        return parentcode;
    }

    public void setParentcode(String parentcode) {
        this.parentcode = parentcode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
