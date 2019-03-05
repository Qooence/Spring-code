package com.dode.proxy.cglib;

import com.dode.proxy.XiaoMing;
import com.dode.proxy.jdk.Person;

public class Test {
    public static void main(String[] args) {
        try {
            Person obj = (Person)new HouseAgencyCglib().getInstance(XiaoMing.class);
            System.out.println(obj.getClass());
            obj.findHouse();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
