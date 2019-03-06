package com.code.strategy.zombie_strategy;

public abstract class Character {
    protected IAttackBehavior attackBehavior;
    protected ISpeedBehavior speedBehavior;

    void move(){
        System.out.println("移动");
    }

    void attack(){
        this.attackBehavior.attack();
    }

    void speed(){
        this.speedBehavior.speed();
    }

    public void setAttackBehavior(IAttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    public void setSpeedBehavior(ISpeedBehavior speedBehavior) {
        this.speedBehavior = speedBehavior;
    }

    abstract void display();
}
