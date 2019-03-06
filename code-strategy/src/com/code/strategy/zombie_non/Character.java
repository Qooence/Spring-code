package com.code.strategy.zombie_non;

/**
 * 抽象类 僵尸特征
 * 假设有100种zombie 每种zombie 一个实体类 继承 Character
 * 那么 每种zombie重写character中的抽象方法 100种则需要写100个，缺乏灵活性、可扩展性
 * 攻击方法、移动速度也不是动态的
 * 不可取
 */
public abstract class Character {

    // 移动
    void move(){
        System.out.println("移动");
    }

    // 攻击
    abstract void attack();

    // 外形
    abstract void display();

    // 移动速度
    abstract void speed();

}
