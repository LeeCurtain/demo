package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class User {
    @ApiModelProperty(value = "用户名称")
   public String name;
    @ApiModelProperty(value = "用户密码")
   public int password;
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getPassword(){
        return  password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String toString(){
        return "user{name='"+name+"\',"+"password="+password+"}";
    }
}
