package com.example.demo.service.impl;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

@Service
public class UserServiceImpl implements UserService {
    public User getUserInfo(){
        User user = new User();
        user.setName("jack");
        user.setPassword(12341234);

        return user;
    }

    public  String getStr()
    {
        String[] arrstr={"22","11"};
        for (int i=0;i<arrstr.length;i++)
        {
            System.out.println(arrstr[i]);
        }
       // File file= new File("");
        //file.mkdir();
        //file.mkdirs();
         Date date= new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
       // SimpleFormatter ft=new SimpleFormatter();
        //ft.format("yyyy-MM-dd hh:mm:ss");
        String [] arr= new  String[2];
        arr[0]="4578";
        StringBuffer sb= new StringBuffer();
        sb.append("啦啦啦啦啦");
        sb.append("哈哈哈哈哈哈");
        sb.append(ft.format(date));

        return  sb.toString();
    }
}