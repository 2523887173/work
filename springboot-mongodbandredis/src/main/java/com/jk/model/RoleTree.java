package com.jk.model;

import java.io.Serializable;

public class RoleTree implements Serializable {
    private Integer id;
    private Integer roleid;
    private Integer treeid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getTreeid() {
        return treeid;
    }

    public void setTreeid(Integer treeid) {
        this.treeid = treeid;
    }

    @Override
    public String toString() {
        return "RoleTree{" +
                "id=" + id +
                ", roleid=" + roleid +
                ", treeid=" + treeid +
                '}';
    }
}
