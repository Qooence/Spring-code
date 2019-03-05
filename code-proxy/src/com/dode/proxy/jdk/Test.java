package com.dode.proxy.jdk;

import com.dode.proxy.XiaoMing;

public class Test {

    public static void main(String[] args) {
        Person obj = null;
        try {
            obj = (Person) new HouseAgencyJDK().getInstance(new XiaoMing());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(obj.getClass());
        obj.findHouse();
    }
}
