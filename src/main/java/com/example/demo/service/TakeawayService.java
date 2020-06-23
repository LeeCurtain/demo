package com.example.demo.service;

import com.sun.org.apache.xpath.internal.objects.XString;
import org.springframework.stereotype.Component;


public interface TakeawayService {
    /**
     * 点餐接口
     * @return
     */
    public String Order(double price);
}
