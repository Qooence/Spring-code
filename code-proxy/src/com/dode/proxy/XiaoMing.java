package com.dode.proxy;

import com.dode.proxy.jdk.Person;

public class XiaoMing implements Person{

    @Override
    public void findHouse() {
        System.out.println("一室一厅，带阳台，采光好");
    }
}
