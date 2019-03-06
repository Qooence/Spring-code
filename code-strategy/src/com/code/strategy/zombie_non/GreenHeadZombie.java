package com.code.strategy.zombie_non;

/**
 * 绿头僵尸
 */
public class GreenHeadZombie extends Character {

    @Override
    void attack() {
        System.out.println("攻击方式->野蛮冲撞");
    }

    @Override
    void display() {
        System.out.println("我的头是绿色的");
    }

    @Override
    void speed() {
        System.out.println("我的移动速度1.0m/s");
    }

}
