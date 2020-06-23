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

public class TakeXmlController {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aoporder.xml");
    @RequestMapping(value = "/orderxml",method = RequestMethod.GET)
    public ResponseResult Ordexml()
    {
        /**
        ** 注意 此处的getBean（name）中的name 必须要和aoporder.xml 配置的bean节点上的id 保持一致
         * 如： <bean id="wmzService" class="com.example.demo.service.impl.WMZServiceImpl"></bean>
         *  TakeawayService wmzService=(TakeawayService)context.getBean("wmzService");
         */
        TakeawayService wmzService=(TakeawayService)context.getBean("wmzService");
        String wmz= wmzService.Order(12);
        System.out.println(wmz);
        TakeawayService zsService=(TakeawayService)context.getBean("zsService");
        String zs=zsService.Order(4396);
        System.out.println(zs);
        return Response.makeOKRsp(wmz+";"+zs);
    }
}
