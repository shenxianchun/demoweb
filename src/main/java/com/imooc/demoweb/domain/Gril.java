package com.imooc.demoweb.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity             //表示这个类对应数据库中的一个表
public class Gril {
    @Id
    @GeneratedValue//表示id为自增
    private Integer id;

    private Integer age;

    private String cupSize;

    public Gril() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }
}
