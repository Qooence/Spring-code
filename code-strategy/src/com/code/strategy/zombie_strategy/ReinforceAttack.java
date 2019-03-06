package com.code.strategy.zombie_strategy;

public class ReinforceAttack implements IAttackBehavior {
    @Override
    public void attack() {
        System.out.println("攻击方式==>百步穿杨");
    }
}
