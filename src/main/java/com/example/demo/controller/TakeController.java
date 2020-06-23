package com.example.demo.controller;

import com.example.demo.entity.Response;
import com.example.demo.entity.ResponseResult;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.TakeawayService;
@RestController
@RequestMapping("/api")
public class TakeController {

    /**
     *此处@Autowired 也可替换为 @Resource(name="") name:中填写你想注入的bean对象名称
     * 如：@Resource("WMZServiceImpl")
     * private  TakeawayService wmzService;
     */
    @Qualifier("WMZServiceImpl")//指定注入的bean对象名称
    @Autowired
    private  TakeawayService wmzService;
    @Qualifier("ZSServiceImpl")
    @Autowired
    private  TakeawayService zsService;


    @RequestMapping(value="/order",method = RequestMethod.GET)
    public ResponseResult Orde()
    {
       String wmz= wmzService.Order(12);
        System.out.println(wmz);
       String zs=zsService.Order(4396);
        System.out.println(zs);
        return Response.makeOKRsp(wmz+";"+zs);
    }

}
