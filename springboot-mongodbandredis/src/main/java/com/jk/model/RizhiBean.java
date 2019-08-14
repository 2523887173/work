package com.jk.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class RizhiBean implements Serializable {
    @Id
    private String id;
    private String name;
    private String rizhiTime;
    private String rizhiUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRizhiTime() {
        return rizhiTime;
    }

    public void setRizhiTime(String rizhiTime) {
        this.rizhiTime = rizhiTime;
    }

    public String getRizhiUrl() {
        return rizhiUrl;
    }

    public void setRizhiUrl(String rizhiUrl) {
        this.rizhiUrl = rizhiUrl;
    }

    @Override
    public String toString() {
        return "rizhiBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rizhiTime='" + rizhiTime + '\'' +
                ", rizhiUrl='" + rizhiUrl + '\'' +
                '}';
    }
}
