package com.code.strategy.zombie_strategy;

public class SuperAttack implements IAttackBehavior {

    @Override
    public void attack() {
        System.out.println("攻击方式==>横扫千军");
    }
}
