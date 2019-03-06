package com.code.strategy.zombie_non;

public class Test {
    public static void main(String[] args) {
        Character character2 = new GreenHeadZombie();
        character2.move();
        character2.attack();
        character2.display();
        character2.speed();

        Character character1 = new GreenHeadZombie();
        character1.move();
        character1.attack();
        character1.display();
        character1.speed();
    }
}
