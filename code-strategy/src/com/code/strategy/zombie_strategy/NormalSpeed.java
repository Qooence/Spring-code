package com.code.strategy.zombie_strategy;

public class NormalSpeed implements ISpeedBehavior {
    @Override
    public void speed() {
        System.out.println("移动速度==>2.0m/s");
    }
}
