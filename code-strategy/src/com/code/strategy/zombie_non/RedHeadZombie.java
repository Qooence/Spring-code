package com.code.strategy.zombie_non;

public class RedHeadZombie extends Character{
    @Override
    void attack() {
        System.out.println("攻击方法->扫堂腿");
    }

    @Override
    void display() {
        System.out.println("我的头是红色的");
    }

    @Override
    void speed() {
        System.out.println("我的移动速度是3m/s");
    }
}
