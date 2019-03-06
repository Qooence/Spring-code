package com.code.strategy.zombie_strategy;

public class GreenHeadZombie extends Character{
    @Override
    void display() {
        System.out.println("我的绿头僵尸");
    }

    public GreenHeadZombie(IAttackBehavior attackBehavior,ISpeedBehavior speedBehavior){
        this.attackBehavior = attackBehavior;
        this.speedBehavior = speedBehavior;
    }
}
