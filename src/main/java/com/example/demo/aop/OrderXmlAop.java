package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class OrderXmlAop {

    /**
     * @description  在连接点执行之前执行的通知
     */
    public void doBefore(){
        System.out.println("阿里阿塞哟！");
    }

    /**
     * @description  在连接点执行之后执行的通知（返回通知和异常通知的异常）
     */
    public void doAfter(){
        System.out.println("after！");
    }


    /**
     * @description  在连接点执行之后执行的通知（返回通知）
     */
     public void doAfterReturning(){

         System.out.println("返回通知：AfterReturning");
      }

    /**
     * @description  在连接点执行之后执行的通知（异常通知）
     */
    public void doAfterThrowing(){
     System.out.println("异常通知：AfterThrowing");
     }

    /**
     * @description  在连接点执行之后执行的通知（异常通知）
     */
    public void doAround(ProceedingJoinPoint pj) {
        try {
            System.out.println("Around 调用方法前 ");
            pj.proceed();
            System.out.println("Around 调用方法后");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
