package com.example.demo;

import java.util.Date;

public class Greeting {
    private String msg;
    private Date time;
    private String name;

    public Greeting(String msg, String name){
        this.msg = msg;
        this.name = name;
        this.time = new Date();
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
