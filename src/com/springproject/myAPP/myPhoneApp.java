package com.springproject.myAPP;

import com.springproject.JAVAcofig.AppConfig;
import com.springproject.objectclass.MobilePhone;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class myPhoneApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=
                new AnnotationConfigApplicationContext(AppConfig.class);
       MobilePhone  phone= applicationContext.getBean("mobilePhone", MobilePhone.class);
       phone.setPhoneNumber("12345");
        phone.myPhoneNumber();
        phone.setCamera("64MPX");
      String camera  = phone.getCamera();
        System.out.println(camera);
        phone.getMobilePhoneList();


    }


}
