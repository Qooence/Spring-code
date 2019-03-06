package com.code.strategy.zombie_strategy;


public class RedHeadZombie extends Character{

    @Override
    void display() {
        System.out.println("我是红头僵尸");
    }

    public RedHeadZombie(IAttackBehavior attackBehavior,ISpeedBehavior speedBehavior){
        this.attackBehavior = attackBehavior;
        this.speedBehavior = speedBehavior;
    }
}
