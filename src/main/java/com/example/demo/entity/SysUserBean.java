package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "sys_user")
public class SysUserBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fid")
    private Integer fid;// 自增ID

    @Column(name = "fname")
    private String fname;//名称

    public Integer getFid() {
        return fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}
