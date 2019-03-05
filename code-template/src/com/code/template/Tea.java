package com.code.template;

public class Tea extends Bevegrage {

    // 原材料放到杯中
    @Override
    public void pourInCup() {
        System.out.println("将茶叶倒入杯中");
    }

    // 放辅料
    @Override
    public void addCoundiments() {
        System.out.println("添加蜂蜜");
    }
}
