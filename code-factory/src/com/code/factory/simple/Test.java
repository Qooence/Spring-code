package com.code.factory.simple;

public class Test {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getPhone("Iphone").getName());
        System.out.println(factory.getPhone("HuaWei").getName());
        System.out.println(factory.getPhone("meizu").getName());
    }
}
