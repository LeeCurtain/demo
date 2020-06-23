package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect // 表示它是一个切面。
@Component //表明它将作为一个Spring Bean 被装配
public class OrderAop {

    /**
     *@description 定义切入点，切入点为execution(public * com.example.demo.service.TakeawayService.*(..)))中的所有函数
     *@description 通过@Pointcut注解声明频繁使用的切点表达式
     * */
/*    @Pointcut("execution(public * com.example.demo.service.TakeawayService.Order(double)) && args(price) && bean(ZSServiceImpl)")
    public void point(double price)
    {

    }*/

    /**
     * @description  在连接点执行之前执行的通知
     * 全匹配
     * execution(public * com.example.demo.service.TakeawayService.*(..)))
     * 只匹配zs within 限定该切点仅匹配的包 bean 在切点中选择
     * execution(public * com.example.demo.service.TakeawayService.Order(..)) && within(com.example.demo.service.impl.*) && bean(ZSServiceImpl)
     */
  /*  @Before("point()")
    public void doBefore(){
        System.out.println("阿里阿塞哟！");
    }
*/
    /**
     * @description  在连接点执行之后执行的通知（返回通知和异常通知的异常）
     */
   /* @After("point()")
    public void doAfter(){
        System.out.println("after！");
    }
*/

   /**
     * @description  在连接点执行之后执行的通知（返回通知）
     */
   // @AfterReturning("point()")
   // public void doAfterReturning(){

   //     System.out.println("返回通知：AfterReturning");
  //  }

    /**
     * @description  在连接点执行之后执行的通知（异常通知）
     */
    //@AfterThrowing("point()")
    //public void doAfterThrowing(){
      //  System.out.println("异常通知：AfterThrowing");
   // }


    /**
     * @description 定义增强
     * @param pj
     */
   /* @Around("point(price)")
    public String doAround(ProceedingJoinPoint pj,double price) {
        try {
            System.out.println("Around 调用方法前 ");
            pj.proceed();
            if(price>=4396)
            {
                System.out.println("zs下单超过了4399，赠送一份鲜果饮汇源牌饮料");
                return "爆浆牛丸和饮料";
            }
            System.out.println("Around 调用方法后");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return "爆浆牛丸";
    }*/

}
