package com.code.strategy.zombie_strategy;

public class FastSpeed implements ISpeedBehavior {
    @Override
    public void speed() {
        System.out.println("移动速度==>3.0m/s");
    }
}
