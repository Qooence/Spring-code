package com.code.strategy.zombie_strategy;

public class Test {
    public static void main(String[] args) {
        GreenHeadZombie green = new GreenHeadZombie(new SuperAttack(),new NormalSpeed());
        RedHeadZombie red = new RedHeadZombie(new ReinforceAttack(),new FastSpeed());

        green.attack();
        green.speed();

        red.attack();
        red.speed();
    }
}
