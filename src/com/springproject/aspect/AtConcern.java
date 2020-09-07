package com.springproject.aspect;

import com.springproject.objectclass.MobilePhone;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class AtConcern {
    @Pointcut("execution(* myPhone*())")
    private void pointCut(){}

    @Before("pointCut()")
    private void demoMonitor(){
        System.out.println("=============> This is an aspect running before MyPhone Classes ");
    }
//    @Before("execution( * myPhone*())")
//    public void demoMonitor(){
//        System.out.println("=============> This is an aspect running before MyPhone Classes ");
//    }
    @AfterReturning(
            pointcut = "execution(* com.springproject.objectclass.MobilePhone.getMobilePhoneList(..))",
            returning = "mobilePhoneList")
    public void afterMobilePhoneReturned(JoinPoint joinPoint, List<MobilePhone> mobilePhoneList){
        MethodSignature signature= (MethodSignature) joinPoint.getSignature();
        System.out.println("MethodSignature from Advice returning: "+ signature);
        System.out.println("printing List: "+ mobilePhoneList);
    }

}
