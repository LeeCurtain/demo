package com.example.demo.entity;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Penguin {
    private String name;
    private  int id;
    public Penguin(String Name,int Id)
    {
        name=Name;
        id= Id;
    }
    public void eat()
    {
        System.out.println(name+"正在吃");
    }
    public  void  sleep()
    {
        System.out.printf(name+"正在睡");
    }
    public  void  introduction()
    {
        System.out.printf("大家好！我是"+id+"号"+name+".");
    }
}
