package com.code.strategy.zombie_strategy;

public class SlowSpeed implements ISpeedBehavior {
    @Override
    public void speed() {
        System.out.println("移动速度==>1.0m/s");
    }
}
