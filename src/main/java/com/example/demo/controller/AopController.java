package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AopController {

    @RequestMapping(value = "/EatWMZ",method = RequestMethod.GET)
    public void EatWMZ(){
        System.out.println("王麻子点了一份瓜皮香锅");
    }
    @RequestMapping(value = "/EatZS",method = RequestMethod.GET)
    public void EatZS(){
        System.out.println("张三点了一份爆浆牛丸");
    }
}
