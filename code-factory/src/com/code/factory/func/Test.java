package com.code.factory.func;

/*
* 用户还有关心工厂 也不太合理
* 能否实现动态配置？ 能 -> 抽象工厂
* */
public class Test {
    public static void main(String[] args) {
        IPhoneFactory iPhoneFactory = new IPhoneFactory();
        System.out.println(iPhoneFactory.getPhone().getName());
    }
}
