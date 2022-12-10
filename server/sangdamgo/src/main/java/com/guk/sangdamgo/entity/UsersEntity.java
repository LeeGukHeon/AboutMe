package com.guk.sangdamgo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String uId;

    private String uPw;

    private String uName;

    private String uNickname;

    private String uPhone;

    private String uEmail;

    private String uBirth;

    private String uType;

    private String uAuth;

    private String uRegdate;

    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuPw() {
        return uPw;
    }

    public void setuPw(String uPw) {
        this.uPw = uPw;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuBirth() {
        return uBirth;
    }

    public void setuBirth(String uBirth) {
        this.uBirth = uBirth;
    }

    public String getuType() {
        return uType;
    }

    public void setuType(String uType) {
        this.uType = uType;
    }

    public String getuAuth() {
        return uAuth;
    }

    public void setuAuth(String uAuth) {
        this.uAuth = uAuth;
    }

    public String getuRegdate() {
        return uRegdate;
    }

    public void setuRegdate(String uRegdate) {
        this.uRegdate = uRegdate;
    }

    @Override
    public String toString() {
        return "UsersEntity{" +
                "idx=" + idx +
                ", uId='" + uId + '\'' +
                ", uPw='" + uPw + '\'' +
                ", uName='" + uName + '\'' +
                ", uNickname='" + uNickname + '\'' +
                ", uPhone='" + uPhone + '\'' +
                ", uEmail='" + uEmail + '\'' +
                ", uBirth='" + uBirth + '\'' +
                ", uType='" + uType + '\'' +
                ", uAuth='" + uAuth + '\'' +
                ", uRegdate='" + uRegdate + '\'' +
                '}';
    }
}
