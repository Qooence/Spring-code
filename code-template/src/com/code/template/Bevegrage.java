package com.code.template;

// 冲饮料机
public abstract class Bevegrage {

    // 不能被重写
    public final void create(){
        // 1、把水烧开
        boilWater();
        // 2、把杯子准备好、原料放到杯中
        pourInCup();
        // 3、用水冲泡
        brew();
        // 4、添加辅料
        addCoundiments();
    }

    public void boilWater (){
        System.out.println("烧开水，烧到100℃可以起锅了");
    }

    public abstract void pourInCup();

    public void brew(){
        System.out.println("将开水放入杯中，进行冲泡");
    }

    public abstract void addCoundiments();
}
