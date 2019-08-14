package com.jk.model;

import java.io.Serializable;

public class PhoneBean implements Serializable {
    private Integer id;
    private String phoneName;
    private Integer typeName;
    private String phoneTime;
    private String phoneStatus;
    private Integer phone;

    @Override
    public String toString() {
        return "PhoneBean{" +
                "id=" + id +
                ", phoneName='" + phoneName + '\'' +
                ", typeName=" + typeName +
                ", phoneTime='" + phoneTime + '\'' +
                ", phoneStatus='" + phoneStatus + '\'' +
                ", phone=" + phone +
                '}';
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public Integer getTypeName() {
        return typeName;
    }

    public void setTypeName(Integer typeName) {
        this.typeName = typeName;
    }

    public String getPhoneTime() {
        return phoneTime;
    }

    public void setPhoneTime(String phoneTime) {
        this.phoneTime = phoneTime;
    }

    public String getPhoneStatus() {
        return phoneStatus;
    }

    public void setPhoneStatus(String phoneStatus) {
        this.phoneStatus = phoneStatus;
    }

}
