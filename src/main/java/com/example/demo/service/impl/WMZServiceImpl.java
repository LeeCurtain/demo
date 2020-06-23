package com.example.demo.service.impl;

import com.example.demo.service.TakeawayService;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class WMZServiceImpl implements TakeawayService {

    @Override
    public String Order(double price)
    {
        System.out.println("wmz瓜皮香锅:"+price);
        return  "王麻子点了一份瓜皮香锅";
    }
}
