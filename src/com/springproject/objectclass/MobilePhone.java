package com.springproject.objectclass;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MobilePhone {
    private  String phoneNumber;
    private  String camera;
    private List<MobilePhone> mobilePhoneList= new ArrayList<>();

    public MobilePhone(){
       super();
    }

    public MobilePhone(String phoneNumber, String camera) {
        this.phoneNumber = phoneNumber;
        this.camera = camera;
      this.mobilePhoneList= new ArrayList<>();
    }

    public void myPhoneNumber(){
        System.out.println("my phone number is : "+ this.phoneNumber);
    }

    public List<MobilePhone> getMobilePhoneList() {
        MobilePhone mobilePhone1=
                new MobilePhone("0343211", "64MPX Dualcore Video Camera");
        this.mobilePhoneList.add(mobilePhone1);
        MobilePhone mobilePhone= new MobilePhone("2322", "34MPX");
        this.mobilePhoneList.add(mobilePhone);
        return this.mobilePhoneList;
    }

    public void setMobilePhoneList(List<MobilePhone> mobilePhoneList) {
        this.mobilePhoneList = mobilePhoneList;
    }

    public void myPhoneCamera(){
        System.out.println("My phone camera is : "+ this.camera);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }
}
