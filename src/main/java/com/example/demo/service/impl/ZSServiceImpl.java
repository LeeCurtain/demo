package com.example.demo.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.demo.service.TakeawayService;
@Service
public class ZSServiceImpl implements TakeawayService {

    @Override
    public String Order(double price) {
        System.out.println("zs爆浆牛丸:"+price);
        return "张三点了一份爆浆牛丸";
    }
}
