package com.example.springbootdemo.bean;


import java.util.Date;

/**
 * 实体类
 * @author  will
 */
public class User {

    private String name;
    private Date date;
    private int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
