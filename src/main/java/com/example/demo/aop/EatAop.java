package com.example.demo.aop;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 饿鸟嘛配送
 **/
@Aspect
@Component
public class EatAop {

    /**
    *@description 定义切入点，切入点为com.example.demo.controller.AopController中的所有函数
    *@description 通过@Pointcut注解声明频繁使用的切点表达式
    * */
    @Pointcut("execution(public * com.example.demo.controller.AopController.*(..)))")
    public void EatAop()
    {

    }
    /**
     * @description  在连接点执行之前执行的通知
     */
    @Before("EatAop()")
    public void doBeforeEat(){
        System.out.println("饿鸟嘛配送员登录接单系统为接单做准备！");
    }

    /**
     * @description  在连接点执行之后执行的通知（返回通知和异常通知的异常）
     */
    @After("EatAop()")
    public void doAfterEat(){
        System.out.println("饿鸟嘛配送员为今天的外卖单量感到异常吃惊！");
    }

    /**
     * @description  在连接点执行之后执行的通知（返回通知）
     */
    @AfterReturning("EatAop()")
    public void doAfterReturningEat(){
        System.out.println("返回的通知：饿鸟嘛配送员接单完毕，并会心一笑百媚生！");
    }

    /**
     * @description  在连接点执行之后执行的通知（异常通知）
     */
    @AfterThrowing("EatAop()")
    public void doAfterThrowingGame(){
        System.out.println("异常通知：服务错误，请联系饿鸟嘛系统管理员！");
    }

}
